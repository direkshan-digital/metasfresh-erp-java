-- Run mode: SWING_CLIENT

-- Name: C_Flatrate_Conditions_Modular_Settings
-- 2024-04-04T13:25:26.240Z
UPDATE AD_Val_Rule SET Code='(C_Flatrate_Conditions_ID IN (SELECT c.C_Flatrate_Conditions_ID FROM C_Flatrate_Conditions c INNER JOIN ModCntr_Settings mc ON (c.ModCntr_Settings_ID = mc.ModCntr_Settings_ID AND mc.M_Raw_Product_ID = @M_Product_ID@ AND mc.c_year_id = @Harvesting_Year_ID@) WHERE c.ModCntr_Settings_ID IS NOT NULL AND c.DocStatus = ''CO'' AND mc.issotrx = ''@IsSOTrx@''))',Updated=TO_TIMESTAMP('2024-04-04 16:25:26.238','YYYY-MM-DD HH24:MI:SS.US'),UpdatedBy=100 WHERE AD_Val_Rule_ID=540640
;

