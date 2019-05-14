package project01.model.insurances.info;

public class CompanyInfo {

    private String insuranceCompany;

    private String companyLocation;

    public CompanyInfo(String insuranceCompany, String companyLocation) {
        this.insuranceCompany = insuranceCompany;
        this.companyLocation = companyLocation;
    }

    @Override
    public String toString() {
        return String.format(
                "Company : %20s| " +
                "Company location : %30s| ",
                insuranceCompany,
                companyLocation);
    }
}
