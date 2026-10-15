public class Main {
    public static void main(String[] args){

        Warehouse warehouse = new Warehouse();

        Product product1 = new Product("P101", "iPhone 16 pro", 4200, 5);
        Product product2 = new Product("P102", "AirPods Pro", 950, 2);

        warehouse.addProduct(product1);
        warehouse.addProduct(product2);

        Order myOrder = warehouse.placeOrder("Meshal", "P101", 2);


        try {
            warehouse.placeOrder("Suhaib", "P102", 1);

        } catch (OutOfStockException | IllegalArgumentException e){
            System.out.println("Order failed" + e.getMessage());
        }

        warehouse.printOrderHistory();
        warehouse.printInventorySummary();

    }
}
