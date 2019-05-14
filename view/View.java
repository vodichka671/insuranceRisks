package project01.view;

import project01.constants.*;
import project01.model.insurances.BaseInsurance;
import project01.services.ResourceManagerModel;
import java.util.List;

import static project01.constants.Constants.LIST_IS_EMPTY;
import static project01.constants.Constants.NOTHING_FOUND_FOR_THIS_REQUEST;


public class View {

    private ResourceManagerModel model = ResourceManagerModel.RESOURCE_MANAGER_INSTANCE;

    public void printMessage(String...message){
        for (String string : message) {
            System.out.println(model.getValue(string));
        }
    }

    public void printMessage(Constants...values){
        for (Constants constants: values) {
            System.out.println(model.getValue(constants.toString()));
        }
    }

    public void printMessageAndValue(Constants message, double value){
        System.out.println(model.getValue(message.toString()) +"   " + value);
    }

    public void printAllList(List<BaseInsurance> list){
        serviceMethods(list, NOTHING_FOUND_FOR_THIS_REQUEST);
    }

    public void printListSortedByWorth(List<BaseInsurance> list){
        serviceMethods(list, LIST_IS_EMPTY);
    }

    private void serviceMethods(List<BaseInsurance> list, Constants message){
        if (list.isEmpty()){
            System.out.println(model.getValue(message.toString()));
            return;
        }
        for (BaseInsurance insurance : list) {
            System.out.println(insurance);
        }
    }
}
