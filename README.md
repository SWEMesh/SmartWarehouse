# SmartWarehouse

[Java](https://img.shields.io/badge/Java-21%20LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
[IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
[Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

A high-performance, robust in-memory **Inventory & Order Management Backend Engine** built in modern Java 21. Engineered with clean Object-Oriented Design (OOP), high efficiency $O(1)$ lookup data structures, and defensive error handling architectures.

---

## Key Architectural Highlights

* **High Speed $O(1)$ Lookups:** Inventory is indexed in an internal `HashMap<String, Product>`, enabling constant-time access by Product ID.
* **Defensive Guard Clauses:** Input validation and stock integrity are enforced at the service boundary before mutating application state.
* **Custom Exception Handling:** Utilizes a domain specific `OutOfStockException` (unchecked) to cleanly handle stock exhaustion without server halts.
* **Immutable Audit Trail:** All successful transactions are logged into an `ArrayList<Order>` to maintain order traceability and financial records.
* **Collaborative Git Workflow:** Multi developer repository managed with feature branching, rebasing, and clean atomic commits.

---

## 📂 Project Architecture

```text
src/
├── Main.java                 # Integration test suite & execution runner
├── Warehouse.java            # Core service layer managing inventory & orders
├── Product.java              # Entity representing warehouse catalog items
├── Order.java                # Immutable record of customer transactions
├── OrderStatus.java          # Enum representing order lifecycle states
└── OutOfStockException.java  # Custom domain exception for stock guard clauses


* Warehouse:	Acts as the central service layer. Manages Map<String, Product> and List<Order>. Validates and executes placeOrder().
* Product:	Encapsulates product attributes (id, name, price, stockQuantity). Exposes controlled state mutations (reduceStock, addStock).
* Order:	Captures order metadata (orderId, customerName, product, quantityOrdered, totalPrice, status).
* OrderStatus:	Strongly-typed lifecycle enum (PENDING, COMPLETED, CANCELLED).
* OutOfStockException:	Custom unchecked runtime exception thrown when requested quantity exceeds available inventory.


