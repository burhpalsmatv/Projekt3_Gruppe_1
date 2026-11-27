package dk.ek.projekt3_gruppe_1.model;

public class Client {
    private int clientId;
    private String mail;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNo;
    private String cprNo;

    public Client(int clientId, String mail, String firstName, String lastName, String address, String phoneNo, String cprNo) {
        this.clientId = clientId;
        this.mail = mail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.cprNo = cprNo;
    }

    public Client(){}

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCprNo() {
        return cprNo;
    }

    public void setCprNo(String cprNo) {
        this.cprNo = cprNo;
    }
}
