import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {
    private Map<String, product> inventory;
    private List<Order> orderHistory;

    public Warehouse(){
        this.inventory = new HashMap<>();
        this.orderHistory = new ArrayList<>();
    }

    public void addProduct(Product product){

        inventory.put(product.getId(), product);
    }

    public void placePrder(String customerName, String productId, int quantity){

        if (quantity > product.getStockquantity()) {
            throw new OutOfStockException(" Product Out of Stock");
    }
        product.reduceStock(quantity);
    }
    }
