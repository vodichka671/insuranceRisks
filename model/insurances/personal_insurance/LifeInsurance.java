package project01.model.insurances.personal_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class LifeInsurance extends PersonalInsurance {

    private double pollution;


    public LifeInsurance() {
    }

    public LifeInsurance(InsuranceInfo insuranceInfo,
                         CompanyInfo companyInfo,
                         ClientInfo clientInfo,
                         OfficialStatistic statistic,
                         double pollution) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.pollution = pollution;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * (Math.sqrt(pollution) + 2);
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Pollution level : %4.2f| ", pollution);
    }
}
