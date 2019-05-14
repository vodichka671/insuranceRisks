package project01.model.insurances;

import project01.model.insurances.info.ClientInfo;
import project01.model.insurances.info.CompanyInfo;
import project01.model.insurances.info.InsuranceInfo;

public abstract class Insurance implements BaseInsurance {

    private InsuranceInfo insuranceInfo;

    private CompanyInfo companyInfo;

    private ClientInfo clientInfo;

    public Insurance() {
    }

    public Insurance(InsuranceInfo insuranceInfo, CompanyInfo companyInfo, ClientInfo clientInfo) {
        this.insuranceInfo = insuranceInfo;
        this.companyInfo = companyInfo;
        this.clientInfo = clientInfo;
    }

    public InsuranceInfo getInsuranceInfo() {
        return insuranceInfo;
    }

    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    @Override
    public double calculateRisk() {
        double depAm = insuranceInfo.getDepositAmount();
        double worth = insuranceInfo.getWorth();
        double risk = depAm/worth;
        insuranceInfo.setRisk(risk);
        return risk;
    }

    @Override
    public double getRisk() {
        return insuranceInfo.getRisk();
    }

    @Override
    public String toString() {
        return "" + insuranceInfo + companyInfo + clientInfo;
    }
}