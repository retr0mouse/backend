package ee.taltech.inbankbackend.config;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT_EUR = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT_EUR = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD_MONTHS = 60;   
    public static final Integer MINIMUM_LOAN_PERIOD_MONTHS = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;
    public static final Integer MINIMUM_AGE_APPROVED_YEARS = 18;
    public static final Integer MAXIMUM_AGE_APPROVED_YEARS = 80 - (MAXIMUM_LOAN_PERIOD_MONTHS / 12);
}
