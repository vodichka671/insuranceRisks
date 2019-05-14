package project01.model.insurances.info;

public class ClientInfo {

    private String clientName;

    private String clientSurname;

    private String dateOfBirth;

    private String address;

    private String phoneNumber;

    public ClientInfo(String clientName, String clientSurname, String dateOfBirth, String address, String phoneNumber) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Client Name : %10s| " +
                "Client Surname : %12s| " +
                "Date of birth : %10s| " +
                "Address : %30s| " +
                "Phone Number : %14s| ",
                clientName,
                clientSurname,
                dateOfBirth,
                address,
                phoneNumber);

    }
}
