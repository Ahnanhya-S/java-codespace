class Items {
    String item;
    int price;
    int quantity;

    // Default constructor
    Items() {
        item = "milk";
        price = 20; // Corrected to an integer
        quantity = 1; // Corrected to an integer
    }

    // Constructor with item name and price
    Items(String a, int b) {
        item = a;
        price = b;
        quantity = 1; // Default quantity set to 1
    }

    // Constructor with item name, price, and quantity
    Items(String a, int b, int c) {
        item = a;
        price = b;
        quantity = c;
    }

    // Method to display item info
    void displayInfo() {
        System.out.println("Item: " + item);
        System.out.println("Price: " + (price * quantity) + " (" + price + " x " + quantity + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating item objects
        Items i1 = new Items(); // Default constructor
        Items i2 = new Items("apple", 50); // Constructor with item name and price
        Items i3 = new Items("carrot", 70, 4); // Constructor with item name, price, and quantity

        // Manually print the total number of items
        System.out.println("Total items: "); // Manually count the items
        
        // Display the details of each item
        i1.displayInfo();
        i2.displayInfo();
        i3.displayInfo();
    }
}