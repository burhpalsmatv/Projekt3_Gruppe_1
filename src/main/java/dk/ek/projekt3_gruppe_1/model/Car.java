package dk.ek.projekt3_gruppe_1.model;

public class Car {
    private int vehicleNo;
    private int vin;
    private String brand;
    private String model;
    private String color;
    private float steelPrice;
    private float registryPrice;
    private float co2Emission;
    private boolean available;

    public Car(int vehicleNo, int vin, String brand, String model, String color, float steelPrice, float registryPrice, float co2Emission, boolean available) {
        this.vehicleNo = vehicleNo;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.steelPrice = steelPrice;
        this.registryPrice = registryPrice;
        this.co2Emission = co2Emission;
        this.available = available;
    }

    public Car(){}

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSteelPrice() {
        return steelPrice;
    }

    public void setSteelPrice(float steelPrice) {
        this.steelPrice = steelPrice;
    }

    public float getRegistryPrice() {
        return registryPrice;
    }

    public void setRegistryPrice(float registryPrice) {
        this.registryPrice = registryPrice;
    }

    public float getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(float co2Emission) {
        this.co2Emission = co2Emission;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
