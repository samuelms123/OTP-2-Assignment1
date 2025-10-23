import java.util.Locale;
import java.util.Scanner;
        /*
        1. Java Console Application Development
        Objective: Create a Java console application that performs the following tasks:
        1. Prompt the user to enter the number of items they want to purchase.
        2. For each item, ask the user for the price and quantity.
        3. Calculate the total cost of each item (price × quantity).
        4. Calculate the total cost of all items in the shopping cart.
        5. Display the total cost of the shopping cart to the user.
        6. Implement localization so that the program can display messages in Finnish, Swedish, and English based
        on the user's language selection.
        Inputs:
        • Item prices (per item).
        • Item quantities (per item).
        Assumption: The program should assume there is no discount applied, but you may add features like discount or
        tax calculation if desired
         */

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = null;

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        System.out.print("Please, select preferred language: ");
        String language = sc.nextLine();

        switch (language) {
            case "1":
                shoppingCart = new ShoppingCart(new Locale("en", "US"));
                break;
            case "2":
                shoppingCart = new ShoppingCart(new Locale("fi", "FI"));
                break;
            case "3":
                shoppingCart = new ShoppingCart(new Locale("sv", "SE"));
                break;
            case "4":
                shoppingCart = new ShoppingCart(new Locale("ja", "JP"));
                break;
            default:
                System.out.println("Invalid language selection");
                break;
        }

        if (shoppingCart != null) {
            shoppingCart.welcomeUser();
            int totalQuantity = shoppingCart.askTotalQuantity();
            if (totalQuantity > 0) {
                shoppingCart.askForItems(totalQuantity);
                shoppingCart.displayTotalCost();
                }
            }
        }

}
