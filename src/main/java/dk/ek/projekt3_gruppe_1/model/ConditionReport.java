package dk.ek.projekt3_gruppe_1.model;

public class ConditionReport {
    private int conditionRepId;
    private int clientId;
    private int userId;
    private int vehicleId;
    private int vin;

    public ConditionReport(int conditionRepId, int clientId, int userId, int vehicleId, int vin) {
        this.conditionRepId = conditionRepId;
        this.clientId = clientId;
        this.userId = userId;
        this.vehicleId = vehicleId;
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

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
