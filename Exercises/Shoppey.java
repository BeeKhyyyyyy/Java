
import java.util.*;

// Base Product class
class ShoppeyProdukto {
    // Private fields of ShoppeyProdukto
    private int productID;
    private String name;
    private double price;
    
    // Constructor for ShoppeyProdukto
    ShoppeyProdukto(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
    
    // Public method to get the product ID
    public int getProductID() {
        return productID;
    }
    
    // Public method to get the name of the product
    public String getName() {
        return name;
    }
    
    // Public method to get the price of the product
    public double getPrice() {
        return price;
    }
    
    // Public method to display the details of the product
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + name);
        System.out.printf("Price: Php %.2f\n" , price);
    }
}

// Electronics subclass of ShoppeyProdukto
class Electronics extends ShoppeyProdukto {
    private int warranty;   // Private field of Electronics (warranty)
    
    // Constructor for Electronics
    Electronics(int productID, String name, double price, int warranty) {
        super(productID, name, price);
        this.warranty = warranty;
    }
    
    // Overriden public method from ShoppeyProdukto to display additional detail (warranty)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("-------------------------------------");
    }
}

// Clothing subclass of ShoppeyProdukto
class Clothing extends ShoppeyProdukto {
    private String size;   // Private field of Clothing (size)
    
    // Constructor for Clothing
    Clothing(int productID, String name, double price, String size) {
        super(productID, name, price);
        this.size = size;
    }
    
    // Overriden public method from ShoppeyProdukto to display additional detail (size)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("-------------------------------------");
    }
}

// ShoppingCart class
class ShoppingCart {
    private List<ShoppeyProdukto> products;   // Private list to store the products in the cart
    
    // Constructor for ShoppingCart to initialize ArrayList
    ShoppingCart() {
        this.products = new ArrayList<>();
    }
    
    // Public method to add product to the cart
    public void addProduct(ShoppeyProdukto product) {
        products.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }
    
    // Public method to remove product from the cart
    public void removeProduct(ShoppeyProdukto product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from the cart.");
    }
    
    // Public method to display the details of the cart
    public void displayCart() {
        if (products.isEmpty()) {   // Will execute if the cart is empty
            System.out.println("Shopping cart is empty.");
        } else {   // Will display the details of the products if the cart is not empty
            for (ShoppeyProdukto product : products) {
                product.displayDetails();
            }
        }
    }
    
    // Public method to calculate the total price of the products
    public double calculateTotalPrice() {
        double total = 0;
        for (ShoppeyProdukto product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Main class to test the program
public class Shoppey {
    public static void main(String[] args) {   // Main method
        // Initializing objects of Electronics, Clothing, and ShoppingCart
        Electronics electronicsItem = new Electronics(69, "Nokia", 999.99, 2);
        Clothing clothingItem = new Clothing(404, "T-Shirt", 19.99, "L");
        ShoppingCart cart = new ShoppingCart();
        
        // Calling methods on the objects to test the program
        cart.addProduct(electronicsItem);
        cart.addProduct(clothingItem);
        System.out.println("\nShoppey Cart Contents:");
        cart.displayCart();
        System.out.println("\nTotal Price: Php " + String.format("%.2f\n", cart.calculateTotalPrice()));
        cart.removeProduct(electronicsItem);
        System.out.println("\nUpdated Shoppey Cart Contents:");
        cart.displayCart();
        System.out.println("\nTotal Price: Php " + String.format("%.2f", cart.calculateTotalPrice()));
    }
}
