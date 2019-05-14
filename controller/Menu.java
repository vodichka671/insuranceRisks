package project01.controller;

import project01.view.View;

import static project01.constants.Constants.*;


public class Menu {

    public static void showWelcomeMenu(View view){
                        view.printMessage(WELCOME,
                                          CHOOSE_LANGUAGE,
                                          ENGLISH,
                                          UKRAINE,
                                          RUSSIAN,
                                          EXIT);
    }

    public static void showWorkMenu(View view){
                        view.printMessage(FILL_INSURANCE_INTO_DERIVATIVE,
                                          COUNT_THE_WORTH_OF_DERIVATIVE,
                                          CALCULATE_RISK,
                                          SORT_BY_RISK,
                                          FIND_INSURANCE_WITH_GREATER_WORTH,
                                          PRINT_ALL_INFO,
                                          BACK);
    }
}
