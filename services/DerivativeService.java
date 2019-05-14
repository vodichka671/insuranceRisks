package project01.services;

import project01.model.insurances.BaseInsurance;
import project01.view.View;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static project01.constants.Constants.*;
import static project01.services.InfoBase.*;

public class DerivativeService {

    private View view;
    private List<BaseInsurance> insuranceList;
    private double worth;

    public DerivativeService(View view, List<BaseInsurance> insuranceList) {
        this.view = view;
        this.insuranceList = insuranceList;
    }

    public void calculateRisk(){
        if(check()) return;
        countWorth();
        for (BaseInsurance insurance : insuranceList) {
            insurance.calculateRisk();
        }
        view.printMessage(RISK_CALCULATED);
    }

    public void sortByRisk(){
        if (check()) return;
        insuranceList.sort(new Comparator<BaseInsurance>() {
            @Override
            public int compare(BaseInsurance o1, BaseInsurance o2) {
                return Double.compare(o1.getRisk(), o2.getRisk());
            }
        });
        view.printMessage(DERIVATIVE_WAS_SORTED);
    }

    public List<BaseInsurance> findByWorth() {
        double generatedWorth = generateValue(MONEY_AMOUNT);
        List<BaseInsurance> list = new ArrayList<>();
        for (BaseInsurance insurance : insuranceList) {
            if (insurance.calculateWorth() > generatedWorth){
                list.add(insurance);
            }
        }return list;
    }

    public void countWorth(){
        worth = 0;
        for (BaseInsurance insurance : insuranceList) {
            worth += insurance.calculateWorth();
        }
    }

    public double getWorth(){
        return worth;
    }

    private boolean check(){
        if (insuranceList.isEmpty()){
            view.printMessage(LIST_IS_EMPTY);
            return true;
        }
        return false;
    }

}
