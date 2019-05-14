package project01.model.insurances.private_property_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class TransportInsurance extends PrivatePropertyInsurance {

    private double carAccident;

    public TransportInsurance() {
    }

    public TransportInsurance(InsuranceInfo insuranceInfo,
                              CompanyInfo companyInfo,
                              ClientInfo clientInfo,
                              OfficialStatistic statistic,
                              double carAccident) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.carAccident = carAccident;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * carAccident / 2;
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Car accident statistic : %4.2f| ", carAccident);
    }
}
