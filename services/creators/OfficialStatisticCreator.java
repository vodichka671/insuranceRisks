package project01.services.creators;

import project01.model.insurances.info.OfficialStatistic;

import static project01.services.InfoBase.*;

public class OfficialStatisticCreator {

    public OfficialStatistic createStatistic(){
        return new OfficialStatistic(
                generateValue(PREDICTION_COEFFICIENT),
                generateValue(STATISTIC_COEFFICIENT));
    }
}
