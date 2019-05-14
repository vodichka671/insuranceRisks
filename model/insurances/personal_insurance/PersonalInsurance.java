package project01.model.insurances.personal_insurance;

import project01.model.insurances.*;
import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public abstract class PersonalInsurance extends Insurance{

    private OfficialStatistic statistic;


    public PersonalInsurance() {
    }

    public PersonalInsurance(InsuranceInfo insuranceInfo,
                             CompanyInfo companyInfo,
                             ClientInfo clientInfo,
                             OfficialStatistic statistic) {
        super(insuranceInfo, companyInfo, clientInfo);
        this.statistic = statistic;
    }

    public OfficialStatistic getStatistic() {
        return statistic;
    }

    @Override
    public String toString() {
        return super.toString() + statistic;
    }


    @Override
    public double calculateWorth() {
        InsuranceInfo info = getInsuranceInfo();
        double depAmount = info.getDepositAmount();
        double statistic = this.statistic.getStatistic();
        double prediction = this.statistic.getPrediction();
        double worth = depAmount * (prediction + statistic)/(prediction + 1);
        info.setWorth(worth);
        return worth;
    }
}
