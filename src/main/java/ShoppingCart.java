import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    private final ResourceBundle rb;
    private final Scanner sc;
    private double totalCost = 0;

    public ShoppingCart(Locale language) {
        rb = ResourceBundle.getBundle("MessagesBundle", language);
        sc = new Scanner(System.in);
    }

    public void welcomeUser() {
        System.out.println(rb.getString("selectedMsg"));
    }

    public int askTotalQuantity() {
        System.out.println(rb.getString("totalQuantityMsg"));
        try {
            return sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("Error"); // localize
            return 0;
        }
    }

    public void addToTotalCost(double price, int quantity) {
        totalCost += quantity * price;
    }

    public void displayTotalCost() {
        System.out.println(rb.getString("totalCostMsg") + " " + totalCost + " " + rb.getString("currency"));
    }

    public void askForItems(int itemAmount) {
        for (int i = 0; i < itemAmount; i++) {
            System.out.print(rb.getString("itemPriceMsg"));
            double price = sc.nextDouble();

            System.out.println(rb.getString("itemQuantityMsg"));
            int quantity = sc.nextInt();

            addToTotalCost(price, quantity);
        }
    }
}
