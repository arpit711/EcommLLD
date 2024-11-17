import Entities.Logistics;
import Entities.Order;
import Entities.Product;
import services.CartService;
import services.LogisticService;
import services.OrderService;


public class ECommerceApp {
    public static void main(String[] args) {
//        Create services

        CartService cartService = new CartService();
        OrderService orderService = new OrderService();
        LogisticService logisticService = new LogisticService();

        System.out.println("welcome to E-comm app");


//        add items to the cart
        cartService.addItem(new Product(1, "Laptop", 1500));
        cartService.addItem(new Product(2, "Table", 4500));
        System.out.println("Cart Items: " + cartService.getCartItems());

//        Place and order
        Order order = orderService.placeOrder(cartService.getCartItems());
        System.out.println("Order Placed: " + order);

//        Handle logistics
        logisticService.initiateShipping(order);
        System.out.println("Order Tracking: " + logisticService.getTrackingDetails(order.getOrderId()));

//      // Update tracking
        logisticService.updateTracking(order.getOrderId(), "Order Delivered");
        System.out.println("Order Tracking: " + logisticService.getTrackingDetails(order.getOrderId()));
    }
}
