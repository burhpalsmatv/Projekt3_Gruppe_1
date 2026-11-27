package dk.ek.projekt3_gruppe_1.model;

public class ConditionReport {
    private int conditionRepId;
    private int clientId;
    private int userId;
    private int vehicleNo;
    private int vin;

    public ConditionReport(int conditionRepId, int clientId, int userId, int vehicleNo, int vin) {
        this.conditionRepId = conditionRepId;
        this.clientId = clientId;
        this.userId = userId;
        this.vehicleNo = vehicleNo;
        this.vin = vin;
    }

    public ConditionReport(){}

    public int getConditionRepId() {
        return conditionRepId;
    }

    public void setConditionRepId(int conditionRepId) {
        this.conditionRepId = conditionRepId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
