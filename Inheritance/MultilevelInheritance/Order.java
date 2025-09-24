
class Order {

    double orderId;
    String orderDate;

    Order(double orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    String getOrderStatus() {
        return "Order Placed";
    }

    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(123451, "24-Sept-2025", 139246469933L, "30-Sept-2025");
        order.displayDetails();
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}

class ShippedOrder extends Order {

    double trackingNumber;

    ShippedOrder(double orderId, String orderDate, double trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(double orderId, String orderDate, double trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
