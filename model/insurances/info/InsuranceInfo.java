package project01.model.insurances.info;

public class InsuranceInfo {

    private String managerName;

    private String managerSurname;

    private int insuranceNumber;

    private double depositAmount;

    private double risk;

    private double worth;

    private String dateOfSigned;

    private String expirationDate;

    public InsuranceInfo(String managerName, String managerSurname, int insuranceNumber, double depositAmount, String dateOfSigned, String expirationDate) {
        this.managerName = managerName;
        this.managerSurname = managerSurname;
        this.insuranceNumber = insuranceNumber;
        this.depositAmount = depositAmount;
        this.dateOfSigned = dateOfSigned;
        this.expirationDate = expirationDate;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return String.format(
                        "Manager Name : %10s| " +
                        "Manager Surname: %12s| " +
                        "Insurance Number: %4d| " +
                        "Deposit Amount : %8.2f| " +
                        "Risk : %1.2f| " +
                        "Worth : %8.2f| " +
                        "Date of Signed : %10s| " +
                        "Expiration Date : %10s| ",
                        managerName,
                        managerSurname,
                        insuranceNumber,
                        depositAmount,
                        risk,
                        worth,
                        dateOfSigned,
                        expirationDate);
    }
}
