package project01.model.insurances.liability_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class PublicLiabilityInsurance extends LiabilityInsurance{


    private double socialLevel;

    public PublicLiabilityInsurance() {
    }

    public PublicLiabilityInsurance(InsuranceInfo insuranceInfo,
                                    CompanyInfo companyInfo,
                                    ClientInfo clientInfo,
                                    OfficialStatistic statistic,
                                    double socialLevel) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.socialLevel = socialLevel;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * (1 + socialLevel);
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Social Level : %4.2f| ", socialLevel);
    }
}
