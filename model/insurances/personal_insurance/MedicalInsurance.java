package project01.model.insurances.personal_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class MedicalInsurance extends PersonalInsurance{

    private double mortalityRate;

    public MedicalInsurance() {}

    public MedicalInsurance(InsuranceInfo insuranceInfo,
                            CompanyInfo companyInfo,
                            ClientInfo clientInfo,
                            OfficialStatistic statistic,
                            double mortalityRate) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.mortalityRate = mortalityRate;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * 2 * mortalityRate;
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mortality rate : %4.2f| ", mortalityRate);
    }
}
