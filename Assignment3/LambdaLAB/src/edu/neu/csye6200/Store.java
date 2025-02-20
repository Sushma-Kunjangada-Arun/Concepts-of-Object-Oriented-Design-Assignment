package edu.neu.csye6200;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
    
    // Inner Interface
    interface ItemAPI {
        int getId();
        double getPrice();
        String getName();
    }

    // Inner Class Implementing ItemAPI
    class Item implements ItemAPI {
        private int id;
        private double price;
        private String name;

        public Item(int id, double price, String name) {
            this.id = id;
            this.price = price;
            this.name = name;
        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public double getPrice() {
            return price;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Item{id=" + id + ", name='" + name + "', price=$" + String.format("%.2f", price) + "}";
        }
    }

    private List<ItemAPI> items;
    private double total;

    public Store() {
        items = new ArrayList<>();
        total = 0.0;
    }

    public void addItem(int id, double price, String name) {
        items.add(new Item(id, price, name));
    }

    // Lambda for Sorting
    public void sortItems(String criteria) {
        Comparator<ItemAPI> comparator;

        if (criteria == null || criteria.isEmpty()) {
            System.out.println("No sorting criteria provided. Sorting by ID (default).");
            items.sort((a, b) -> Integer.compare(a.getId(), b.getId())); // Explicit Lambda
        } else {
            comparator = switch (criteria) {
                case "ID" -> (a, b) -> Integer.compare(a.getId(), b.getId());
                case "Price" -> (a, b) -> Double.compare(a.getPrice(), b.getPrice());
                case "Name" -> (a, b) -> a.getName().compareTo(b.getName());
                default -> throw new IllegalArgumentException("Invalid sorting criteria: " + criteria);
            };
            items.sort(comparator);
        }
        
        //Lambda for ForEach Consumer
        items.forEach(item -> System.out.println(item));
    }

    // Static demo Method
    public static void demo() {
        Store store = new Store();

        store.addItem(2, 2.49, "Milk");
        store.addItem(4, 1.49, "Bread");
        store.addItem(3, 3.49, "OJ");
        store.addItem(1, 0.99, "Candy");
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);


        double total = store.items.stream().mapToDouble(ItemAPI::getPrice).sum();
        double cash = 20.00;
        double change = cash - total;
        
        System.out.println("======================");
        System.out.println("      RECEIPT         ");
        System.out.println("======================");
        System.out.println("Date & Time: " + formattedDateTime);
        System.out.println("----------------------");
        store.items.forEach(item -> 
            System.out.println(item.getName() + " - $" + String.format("%.2f", item.getPrice()))
        );
        System.out.println("----------------------");
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Paid: $" + String.format("%.2f", cash));
        System.out.println("Change: $" + String.format("%.2f", change));
        System.out.println("======================\n");
        
        // Display Before Sorting
        System.out.println("\nBefore Sorting:");
        store.items.forEach(item -> System.out.println(item));

        System.out.println("\n\nSorting by ID:");
        store.sortItems("ID");
        System.out.println("\n\nSorting by Price:");
        store.sortItems("Price");
        System.out.println("\n\nSorting by Name:");
        store.sortItems("Name");
        System.out.println("\n\n");
        store.sortItems("");  // Default sorting
    }

}

