package services;

import Entities.Logistics;
import Entities.Order;

import java.util.HashMap;
import java.util.Map;

public class LogisticService {
    private Map<Integer, Logistics> logisticsMap = new HashMap<>();

    public void initiateShipping(Order order) {
        logisticsMap.put(order.getOrderId(), new Logistics(order.getOrderId()));
    }

    public void updateTracking(int orderId, String status) {
        if (logisticsMap.containsKey(orderId))
            logisticsMap.get(orderId).setStatus(status);
    }

    public String getTrackingDetails(int orderId) {
        return logisticsMap.containsKey(orderId) ? logisticsMap.get(orderId).getStatus()
                :"Order not available in the System";
    }
}
