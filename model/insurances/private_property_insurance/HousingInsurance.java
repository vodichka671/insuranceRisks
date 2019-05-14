package project01.model.insurances.private_property_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class HousingInsurance extends PrivatePropertyInsurance{

    private double fireRisk;


    public HousingInsurance() {
    }

    public HousingInsurance(InsuranceInfo insuranceInfo,
                            CompanyInfo companyInfo,
                            ClientInfo clientInfo,
                            OfficialStatistic statistic,
                            double fireRisk) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.fireRisk = fireRisk;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * (1 + fireRisk/2);
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Fire risk : %4.2f| ", fireRisk);
    }
}
