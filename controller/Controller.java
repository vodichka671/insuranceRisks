package project01.controller;

import project01.constants.Constants;
import project01.controller.exceptions.*;
import project01.model.Derivative;
import project01.model.insurances.BaseInsurance;
import project01.services.*;
import project01.view.View;
import java.util.List;
import java.util.Locale;
import static project01.constants.Constants.*;
import static project01.controller.console_reader.ConsoleReader.*;
import static project01.services.InfoBase.MONEY_AMOUNT;
import static project01.controller.Menu.*;


public class Controller {

    private View view;
    private Derivative derivative = Derivative.DB_INSTANCE;
    private ResourceManagerModel model  = ResourceManagerModel.RESOURCE_MANAGER_INSTANCE;
    private Constants CHOICE;

    public Controller(View view) {
        this.view = view;
        derivative.setView(this.view);
    }

    public void welcomeMenu() {
        int firstIndex = 1;
        int lastIndex = 4;
        int shift = 1;
        while (true) {
            showWelcomeMenu(view);
            try {
                int ordinal = chooseBetwen(firstIndex, lastIndex, shift);
                CHOICE = getEnum(ordinal);
                switch (CHOICE) {
                    case ENGLISH:
                        model.changeResource(new Locale("en", "US"));
                        workMenu();
                        break;
                    case UKRAINE:
                        model.changeResource(new Locale("ua", "UA"));
                        workMenu();
                        break;
                    case RUSSIAN:
                        model.changeResource(Locale.getDefault());
                        workMenu();
                        break;
                    case EXIT:
                        view.printMessage(BYE_BYE);
                        System.exit(0);
                }
            }catch (WrongInputException | IllegalInputException exc){
                view.printMessage(exc.getMessage());
            }
        }
    }

    private void workMenu(){
       boolean flag = true;
       int firstIndex = 1;
       int lastIndex = 7;
       int shift = 5;
       List<BaseInsurance> list;
       DerivativeService service;
        while (flag) {
            showWorkMenu(view);
            try {
                int ordinal = chooseBetwen(firstIndex, lastIndex, shift);
                CHOICE = getEnum(ordinal);
                switch (CHOICE) {
                    case FILL_INSURANCE_INTO_DERIVATIVE:
                        InsuranceCreator creator = new InsuranceCreator(view);
                        derivative.addInsurance(creator.makeListInsurances());
                        break;
                    case COUNT_THE_WORTH_OF_DERIVATIVE:
                        list = derivative.returnAllInsurance();
                        service = new DerivativeService(view, list);
                        service.countWorth();
                        view.printMessageAndValue(THE_WORTH_OF_DERIVATIVE, service.getWorth());
                        break;
                    case CALCULATE_RISK:
                        list = derivative.returnAllInsurance();
                        service = new DerivativeService(view, list);
                        service.calculateRisk();
                        break;
                    case SORT_BY_RISK:
                        list = derivative.returnAllInsurance();
                        service = new DerivativeService(view, list);
                        service.sortByRisk();
                        break;
                    case FIND_INSURANCE_WITH_GREATER_WORTH:
                        list = derivative.returnAllInsurance();
                        service = new DerivativeService(view, list);
                        list = service.findByWorth();
                        view.printListSortedByWorth(list);
                        break;
                    case PRINT_ALL_INFO:
                        list = derivative.returnAllInsurance();
                        view.printAllList(list);
                        break;
                    case BACK:
                        flag = false;
                        break;
                }
            }catch (WrongInputException | IllegalInputException exc){
                view.printMessage(exc.getMessage());
            }
        }
    }
}
