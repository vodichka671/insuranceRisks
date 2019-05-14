package project01.model.insurances.info;

public class OfficialStatistic {

    private double prediction;

    private double statistic;

    public OfficialStatistic() {
    }

    public OfficialStatistic(double prediction, double statistic) {
        this.prediction = prediction;
        this.statistic = statistic;
    }

    public double getPrediction() {
        return prediction;
    }

    public double getStatistic() {
        return statistic;
    }

    @Override
    public String toString() {
        return String.format(
                "Prediction Coefficient : %4.2f| " +
                "Past Statistic : %4.2f| ",
                prediction,
                statistic
        );
    }
}
