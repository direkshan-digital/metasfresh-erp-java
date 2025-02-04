package de.metas.handlingunits.picking.job.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import de.metas.handlingunits.HuId;
import de.metas.handlingunits.picking.QtyRejectedWithReason;
import de.metas.quantity.Quantity;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.adempiere.exceptions.AdempiereException;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Value
public class PickingJobStepPickedTo
{
	@Nullable QtyRejectedWithReason qtyRejected;
	@NonNull ImmutableList<PickingJobStepPickedToHU> actualPickedHUs;

	@NonNull Quantity qtyPicked;
	@Nullable Quantity catchWeight;

	@Builder(toBuilder = true)
	@Jacksonized
	private PickingJobStepPickedTo(
			@NonNull final ImmutableList<PickingJobStepPickedToHU> actualPickedHUs,
			@Nullable final QtyRejectedWithReason qtyRejected)
	{
		// NOTE: empty actualPickedHUs is also OK for the case when the whole HU was rejected
		//Check.assumeNotEmpty(actualPickedHUs, "actualPickedHUs not empty");

		Maps.uniqueIndex(actualPickedHUs, PickingJobStepPickedToHU::getActualPickedHU); // make sure there are no duplicates

		this.qtyRejected = qtyRejected;
		this.actualPickedHUs = actualPickedHUs;

		final Quantity qtyPicked = actualPickedHUs.stream()
				.map(PickingJobStepPickedToHU::getQtyPicked)
				.reduce(Quantity::add)
				.orElse(null);
		if (qtyPicked == null)
		{
			if (qtyRejected == null)
			{
				throw new AdempiereException("qtyPicked and qtyRejected cannot be both null");
			}
			this.qtyPicked = qtyRejected.toQuantity().toZero();
		}
		else
		{
			this.qtyPicked = qtyPicked;
		}

		this.catchWeight = actualPickedHUs.stream()
				.map(PickingJobStepPickedToHU::getCatchWeight)
				.filter(Objects::nonNull)
				.reduce(Quantity::add)
				.orElse(null);

		Quantity.assertSameUOM(this.qtyPicked, this.qtyRejected != null ? this.qtyRejected.toQuantity() : null);
	}

	public Stream<PickingJobStepPickedToHU> stream() {return actualPickedHUs.stream();}

	@Nullable
	public PickingJobStepPickedTo removing(final List<PickingJobStepPickedToHU> toRemove)
	{
		if (toRemove.isEmpty())
		{
			return this;
		}

		final ImmutableList<PickingJobStepPickedToHU> actualPickedHUsNew = this.actualPickedHUs.stream()
				.filter(pickedHU -> !toRemove.contains(pickedHU))
				.collect(ImmutableList.toImmutableList());

		if (actualPickedHUsNew.size() == actualPickedHUs.size())
		{
			return this;
		}

		if (actualPickedHUsNew.isEmpty() && this.qtyRejected == null)
		{
			return null;
		}

		return toBuilder().actualPickedHUs(actualPickedHUsNew).build();
	}

	@NonNull
	public List<HuId> getPickedHuIds()
	{
		return actualPickedHUs.stream()
				.map(PickingJobStepPickedToHU::getActualPickedHU)
				.map(HUInfo::getId)
				.collect(ImmutableList.toImmutableList());
	}
}
