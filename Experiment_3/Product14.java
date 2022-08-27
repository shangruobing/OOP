package Experiment_3;

import java.util.StringTokenizer;

/**
 * @author 冰
 */
public class Product14 {
    private String name;
    private int quantity;
    private double price;

    public Product14(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public static Product14 createProduct(String str, String deli) {
        StringTokenizer tokenizer = new StringTokenizer(str, deli);
        if (tokenizer.countTokens() == 3) {
            String name = tokenizer.nextToken();
            int quantity = Integer.parseInt(tokenizer.nextToken());
            double price = Double.parseDouble(tokenizer.nextToken());
            return new Product14(name, quantity, price);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String data = "Mini Discs 74 Minute(10-Pack)_5_9.00";
        Product14 product14 = createProduct(data, "_");
        System.out.println("Name: " + product14.getName());
        System.out.println("Quantity: " + product14.getQuantity());
        System.out.println("Price: " + product14.getPrice());
        System.out.println("Total: " + product14.getQuantity() * product14.getPrice());
    }
}
