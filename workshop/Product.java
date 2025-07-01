class Product {
    private String name;
    private String category;
    private double price;
    private int stock;

    public Product(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price + " | Stock: " + stock;
    }
}

class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class InvalidStockException extends RuntimeException {
    public InvalidStockException(String message) {
        super(message);
    }
}

class ProductCatalog {
    private static final int MAX_PRODUCTS = 100;
    private static final int MAX_STOCK = 1000;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int count = 0;

    public void addProduct(Product product) {
        if (count < MAX_PRODUCTS) {
            products[count++] = product;
        }
    }

    public Product[] searchByName(String name) {
        Product[] result = new Product[MAX_PRODUCTS];
        int idx = 0;
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                result[idx++] = products[i];
            }
        }
        return trimArray(result, idx);
    }

    public Product[] searchByCategory(String category) {
        Product[] result = new Product[MAX_PRODUCTS];
        int idx = 0;
        for (int i = 0; i < count; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                result[idx++] = products[i];
            }
        }
        return trimArray(result, idx);
    }

    public void updateStock(String name, int newStock) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                if (newStock < 0 || newStock > MAX_STOCK) {
                    throw new InvalidStockException("Stock must be between 0 and " + MAX_STOCK);
                }
                products[i].setStock(newStock);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ProductNotFoundException("Product not found: " + name);
        }
    }

    public Product[] generateReport(boolean ascending) {
        Product[] sorted = new Product[count];
        for (int i = 0; i < count; i++) {
            sorted[i] = products[i];
        }

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                boolean condition = ascending
                    ? sorted[j].getPrice() > sorted[j + 1].getPrice()
                    : sorted[j].getPrice() < sorted[j + 1].getPrice();
                if (condition) {
                    Product temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }

    private Product[] trimArray(Product[] arr, int length) {
        Product[] trimmed = new Product[length];
        for (int i = 0; i < length; i++) {
            trimmed[i] = arr[i];
        }
        return trimmed;
    }
}
 class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product("Laptop", "Electronics", 999.99, 20));
        catalog.addProduct(new Product("Mouse", "Electronics", 49.99, 100));
        catalog.addProduct(new Product("Notebook", "Stationery", 2.49, 300));

        Product[] electronics = catalog.searchByCategory("Electronics");
        for (Product p : electronics) {
            System.out.println(p);
        }

        try {
            catalog.updateStock("Laptop", 25);
            catalog.updateStock("Tablet", 10);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        Product[] report = catalog.generateReport(true);
        for (Product p : report) {
            System.out.println(p);
        }
    }
}
