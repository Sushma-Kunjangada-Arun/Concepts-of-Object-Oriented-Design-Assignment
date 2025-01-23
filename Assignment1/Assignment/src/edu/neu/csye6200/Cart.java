package edu.neu.csye6200;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {

    // Inner class Item
    public class Item {
        private int id;
        private double price;
        private String name;

        // Constructor
        public Item(String csvLine) throws IllegalArgumentException {
            try {
                String[] parts = csvLine.split(",", -1); // Include trailing empty fields
                if (parts.length != 3) { // Ensures at least three fields
                    throw new IllegalArgumentException("Invalid format in CSV line: " + csvLine + ". Expected 3 fields (ID, Price, Name).");
                }

                // Validate ID
                if (parts[0].trim().isEmpty()) {
                    throw new IllegalArgumentException("Missing ID in CSV line: " + csvLine);
                }
                try {
                    this.id = Integer.parseInt(parts[0].trim());
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid ID format in CSV line: " + csvLine + ". ID must be numeric.", e);
                }

                // Validate Price
                if (parts[1].trim().isEmpty()) {
                    throw new IllegalArgumentException("Missing price in CSV line: " + csvLine);
                }
                try {
                    this.price = Double.parseDouble(parts[1].trim());
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid price format in CSV line: " + csvLine + ". Price must be numeric.", e);
                }

                // Validate Name
                String nameStr = parts[2].trim();
                if (!nameStr.matches("^[A-Za-z]+$")) {
                    throw new IllegalArgumentException("Invalid item name format in CSV line: " + csvLine +
                        ". Name can only contain letters");
                }
                this.name = nameStr;

            } catch (IllegalArgumentException e) {
                throw e; // Rethrow for logging
            } catch (Exception e) {
                throw new IllegalArgumentException("Error parsing CSV line: " + csvLine + ". Please check the input format.", e);
            }
        }


        // Getters
        public int getId() {
            return id;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Item{id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
        }
    }

    // Cart attributes
    private ArrayList<Item> items;
    private double total;

    // Constructor
    public Cart() {
        items = new ArrayList<>();
        total = 0.0;
    }

    // Add method
    public void add(Item item) {
        if (total + item.getPrice() <= 20.0) {
            items.add(item);
            total += item.getPrice();
        } else {
            System.out.println("Cannot add '" + item.getName() + "' to the cart. Total exceeds $20.");
        }
    }

    // Sort by ID
    public void sortById() {
        Collections.sort(items, Comparator.comparing(Item::getId));
    }

    // Sort by Price
    public void sortByPrice() {
        Collections.sort(items, Comparator.comparing(Item::getPrice));
    }

    // Sort by Name
    public void sortByName() {
        Collections.sort(items, Comparator.comparing(Item::getName));
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart Contents:\n");
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

    // Static demo method
    public static void demo() {
        Cart cart = new Cart();
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/sushmaka/Documents/Assignment1/items.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    cart.add(cart.new Item(line));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()); // Updated to avoid redundant prefix "Error:"
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Calculate and display change
        double change = 20.0 - cart.total;
        System.out.println("\nTotal Cost: $" + String.format("%.2f", cart.total));
        System.out.println("Change: $" + String.format("%.2f", change) + "\n\n");

        // Display cart before sorting
        System.out.println("Before Sorting:");
        System.out.println(cart);

        // Sort and display cart by ID
        cart.sortById();
        System.out.println("\nSorted by ID:");
        System.out.println(cart);

        // Sort and display cart by Price
        cart.sortByPrice();
        System.out.println("\nSorted by Price:");
        System.out.println(cart);

        // Sort and display cart by Name
        cart.sortByName();
        System.out.println("\nSorted by Name:");
        System.out.println(cart);
    }
}