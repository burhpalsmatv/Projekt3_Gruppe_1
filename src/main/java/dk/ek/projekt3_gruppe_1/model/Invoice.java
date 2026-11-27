package dk.ek.projekt3_gruppe_1.model;

import java.util.Date;

public class Invoice {
    private int invoiceId;
    private int clientId;
    private int vehicleNo;
    private int vin;
    private Date loanPeriodStart;
    private Date loanPeriodEnd;
    private float mileage;
    private float sum;
    private boolean isPaid;

    public Invoice(int invoiceId, int clientId, int vehicleNo, int vin, Date loanPeriodStart, Date loanPeriodEnd, float mileage, float sum, boolean isPaid) {
        this.invoiceId = invoiceId;
        this.clientId = clientId;
        this.vehicleNo = vehicleNo;
        this.vin = vin;
        this.loanPeriodStart = loanPeriodStart;
        this.loanPeriodEnd = loanPeriodEnd;
        this.mileage = mileage;
        this.sum = sum;
        this.isPaid = isPaid;
    }

    public Invoice(){}

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public Date getLoanPeriodStart() {
        return loanPeriodStart;
    }

    public void setLoanPeriodStart(Date loanPeriodStart) {
        this.loanPeriodStart = loanPeriodStart;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getLoanPeriodEnd() {
        return loanPeriodEnd;
    }

    public void setLoanPeriodEnd(Date loanPeriodEnd) {
        this.loanPeriodEnd = loanPeriodEnd;
    }
}
