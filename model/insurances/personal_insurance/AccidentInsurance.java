package project01.model.insurances.personal_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class AccidentInsurance extends PersonalInsurance {

    private double officialStatistic;

    public AccidentInsurance() {
    }

    public AccidentInsurance(InsuranceInfo insuranceInfo,
                             CompanyInfo companyInfo,
                             ClientInfo clientInfo,
                             OfficialStatistic statistic,
                             double officialStatistic) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.officialStatistic = officialStatistic;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * officialStatistic;
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Official statistic : %4.2f| ", officialStatistic);
    }
}
