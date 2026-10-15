public class Product {

    private String id;
    private String name;
    private double price;
    private int stockQuantity;



public Product(String id, String name, double price, int stockQuantity){

    this.id= id;
    this.name=name;
    this.price=price;
    this.stockQuantity=stockQuantity;


}
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void addStock(int quantity){

        stockQuantity += quantity;

    }


    public void reduceStock(int quantity) {

        stockQuantity -= quantity;

    }


}
