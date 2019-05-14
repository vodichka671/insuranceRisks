package project01.model.insurances.liability_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class GeneralLiabilityInsurance extends LiabilityInsurance{

    private double inflation;

    public GeneralLiabilityInsurance() {
    }

    public GeneralLiabilityInsurance(InsuranceInfo insuranceInfo,
                                     CompanyInfo companyInfo,
                                     ClientInfo clientInfo,
                                     OfficialStatistic statistic, double inflation) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.inflation = inflation;
    }


    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * inflation;
        getInsuranceInfo().setWorth(worth);
        return worth;
    }


    @Override
    public String toString() {
        return super.toString() + String.format("Inflation Rate : %4.2f| ", inflation);
    }
}
