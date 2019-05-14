package project01.services;

import project01.model.insurances.BaseInsurance;
import project01.model.insurances.liability_insurance.*;
import project01.model.insurances.personal_insurance.*;
import project01.model.insurances.private_property_insurance.*;
import project01.services.creators.*;
import project01.view.View;
import java.util.ArrayList;
import java.util.List;
import static project01.services.InfoBase.*;

public class InsuranceCreator {

    private View view;
    private ClientInfoCreator client = new ClientInfoCreator();
    private InsuranceInfoCreator info = new InsuranceInfoCreator();
    private CompanyInfoCreator company = new CompanyInfoCreator();
    private OfficialStatisticCreator statistic = new OfficialStatisticCreator();



    public InsuranceCreator(View view) {
        this.view = view;
    }

    public List<BaseInsurance> makeListInsurances() {
       List<BaseInsurance> insurances = new ArrayList<>();
       insurances.add(new TransportInsurance(
               info.createInsuranceInfo(),
               company.createCompanyInfo(),
               client.createClientInfo(),
               statistic.createStatistic(),
               generateValue(UNIQUE_PARAM)
               )
       );

        insurances.add(new AirTransportInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));

        insurances.add(new HousingInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));

        insurances.add(new LifeInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));

        insurances.add(new MedicalInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));

        insurances.add(new PublicLiabilityInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));

        insurances.add(new GeneralLiabilityInsurance(
                info.createInsuranceInfo(),
                company.createCompanyInfo(),
                client.createClientInfo(),
                statistic.createStatistic(),
                generateValue(UNIQUE_PARAM)));
       return insurances;
    }
}
