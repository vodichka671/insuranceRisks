package project01.services.creators;

import project01.model.insurances.info.CompanyInfo;

import static project01.services.InfoBase.*;

public class CompanyInfoCreator {


    public CompanyInfo createCompanyInfo(){
        return new CompanyInfo(generate(INSURANCE_COMPANY),
                               generate(COMPANY_ADDRESS));
    }
}
