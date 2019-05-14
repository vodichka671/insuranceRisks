package project01.model.insurances.private_property_insurance;

import project01.model.insurances.*;
import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public abstract class PrivatePropertyInsurance extends Insurance{

    private OfficialStatistic statistic;

    public PrivatePropertyInsurance() {
    }

    public PrivatePropertyInsurance(InsuranceInfo insuranceInfo,
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
        double worth = depAmount * (prediction + 2 * statistic)/(prediction + 1);
        info.setWorth(worth);
        return worth;
    }
}
