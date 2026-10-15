public class Order {

    private int orderId;
    private String customerName;
    private Product product;
    private int quantityOrdered;
    private double totalPrice;
    private OrderStatus status;


    public Order(int orderId, String customerName,Product product, int quantityOrdered, OrderStatus status ) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        totalPrice = product.getPrice() * quantityOrdered;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityOrdered(){
        return quantityOrdered;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus Status ) {

        status = Status;

    }

}
