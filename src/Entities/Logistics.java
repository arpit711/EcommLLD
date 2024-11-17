package Entities;
//•	Logistics: Handles tracking and shipping status of orders.

public class Logistics {
    private int orderId;
    private String status;

    public Logistics(int orderId) {
        this.orderId = orderId;
        this.status = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Logistics{orderId=" + orderId + ", status='" + status + "'}";
    }
}
