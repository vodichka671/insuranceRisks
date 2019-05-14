package project01.model.insurances.liability_insurance;

import project01.model.insurances.*;
import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public abstract class LiabilityInsurance extends Insurance{

    private OfficialStatistic statistic;

    public LiabilityInsurance() {
    }

    public LiabilityInsurance(
            InsuranceInfo insuranceInfo,
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
        double worth = depAmount * (prediction + 3 * statistic)/(prediction + 1);
        info.setWorth(worth);
        return worth;
    }
}
