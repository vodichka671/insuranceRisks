package project01.services.creators;

import project01.model.insurances.info.InsuranceInfo;
import static project01.services.InfoBase.*;

public class InsuranceInfoCreator {


    public InsuranceInfo createInsuranceInfo(){
        return new InsuranceInfo(generate(MANAGER_NAME),
                                 generate(MANAGER_SURNAME),
                                 generateValue(INSURANCE_NUMBER),
                                 generateValue(DEPOSIT_AMOUNT),
                                 generate(DATE_OF_SIGNED),
                                 generate(EXPIRATION_DATE));
    }
}
