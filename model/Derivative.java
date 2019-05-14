package project01.model;

import project01.model.insurances.BaseInsurance;
import project01.services.ResourceManagerModel;
import project01.view.View;
import java.util.ArrayList;
import java.util.List;
import static project01.constants.Constants.*;


public enum Derivative {

    DB_INSTANCE;

    private View view;

    private List<BaseInsurance> insuranceList = new ArrayList();

    public void addInsurance(List<BaseInsurance> insurances){
        if (insurances != null) {
            insuranceList.addAll(insurances);
            view.printMessage(INSURANCES_ADDED);
        }
    }

    public List<BaseInsurance> returnAllInsurance(){
        return new ArrayList<>(insuranceList);
    }

    public void setView(View view){
        this.view = view;
    }

}
