import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private Map<String, Product> inventory;
    private List<Order> orderHistory;

    public Warehouse(){
        this.inventory = new HashMap<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addProduct(Product product){

        inventory.put(product.getId(), product);
    }

    public Product getProduct(String productID){

       return inventory.get(productID);
    }
    public Order placeOrder(String customerName, String productId, int quantity){
        Product product = inventory.get(productId);

        if (quantity <= 0){
            throw new IllegalArgumentException("Invalid quantity");
        }
        if (product == null){
            throw new IllegalArgumentException("Product is not available");
        }
        if (quantity > product.getStockQuantity()) {
            throw new OutOfStockException(" Product Out of Stock");
    }

        product.reduceStock(quantity);
        int orderId = orderHistory.size() + 1;
        Order order = new Order(orderId, customerName, product, quantity, OrderStatus.COMPLETED);
        orderHistory.add(order);
        System.out.println("Order placed successfully for" + customerName);
        return order;
    }

    public void printInventorySummary(){

        System.out.println("=== Current Warehouse Inventory ===");

        for (Product product : inventory.values()) {

            System.out.println("ProductID: "+ product.getId());
            System.out.println("ProductName:  "+ product.getName());
            System.out.println("Price: "+ product.getPrice());
            System.out.println("Remaining Stock: : "+ product.getStockQuantity());

        }
    }


    }
