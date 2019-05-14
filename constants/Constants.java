package project01.constants;

public enum Constants {

        WELCOME("welcome"),
        CHOOSE_LANGUAGE("choose_language"),
        ENGLISH("english"),
        UKRAINE("ukraine"),
        RUSSIAN("russian"),
        EXIT("exit"),

        FILL_INSURANCE_INTO_DERIVATIVE("auto_filling"),
        COUNT_THE_WORTH_OF_DERIVATIVE("evaluate_the_worth"),
        CALCULATE_RISK("calculate_risk"),
        SORT_BY_RISK("sort_by_risk"),
        FIND_INSURANCE_WITH_GREATER_WORTH("find_greatest_worth"),
        PRINT_ALL_INFO("print_all_info"),
        BACK("back"),

        WARNING("warning"),
        LIST_IS_EMPTY("empty"),
        CALCULATE_WORTH_BEFORE("calculate_worth"),
        INSURANCES_ADDED("added"),
        OUT_OF_INPUT_RANGE("out_of_input_range"),
        NOTHING_FOUND_FOR_THIS_REQUEST("nothing_found"),
        RISK_CALCULATED("risk_calculated"),

        THE_WORTH_OF_DERIVATIVE("derivative_worth"),
        DERIVATIVE_WAS_SORTED("derivative_sorted"),
        BYE_BYE("bye_bye");

        private String key;

    Constants(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }

    public static Constants getEnum(int ordinal){
        return values()[ordinal];
    }
}
