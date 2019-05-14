package project01.model.insurances.private_property_insurance;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;
import project01.model.insurances.info.OfficialStatistic;

public class AirTransportInsurance extends PrivatePropertyInsurance {


    private double reliability;


    public AirTransportInsurance() {
    }

    public AirTransportInsurance(InsuranceInfo insuranceInfo,
                                 CompanyInfo companyInfo,
                                 ClientInfo clientInfo,
                                 OfficialStatistic statistic,
                                 double reliability) {
        super(insuranceInfo, companyInfo, clientInfo, statistic);
        this.reliability = reliability;
    }

    @Override
    public double calculateWorth() {
        double parentWorth = super.calculateWorth();
        double worth = parentWorth * (Math.sqrt(reliability) + 1);
        getInsuranceInfo().setWorth(worth);
        return worth;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Reliability air transport : %4.2f| ", reliability);
    }
}
