/**
 *
 * Main application that displays a list of groceries and total price after bag fee and reward member discount.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 * @version 8.0.0
 * @since 05-14-2020
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedList;


public class GroceryCheckout {
    public static void countDown(int countInt){
        if(countInt == 3){
            System.out.println("3+");
        }
        else{
            System.out.println(countInt);
            countDown(countInt+1);
        }
    }

    public static void main(String[] args) {
        //linked list to input grocery list
        LinkedList<String> shoppingList = new LinkedList<String>();
        Calculate test = new Calculate();
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        DecimalFormat roundDown = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN);

        shoppingList.add("Bread");
        shoppingList.add("Almond Milk");
        shoppingList.add("Bagels");
        shoppingList.add("Frozen meal x3");
        shoppingList.add("Assorted Vegetables");
        shoppingList.add("Matcha Powder");
        shoppingList.add("Assorted Fruit");
        shoppingList.add("Dark Chocolate x2");

        double totalPrice = 25.65;

        //iterating Linked List
        System.out.println("Items Bought: ");
        Iterator<String> iterator = shoppingList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n How many bags would you like: ");
        countDown(0);

        test.bagTotal(25.65, 2);
        double bagPrice = test.calculate();
        System.out.println("\nThe total price of your groceries is: $" + df.format(bagPrice));
        System.out.println("\nEnter the last four digits of your reward card number: ");

        int result = RewardCard.binarySearch("1231");

        if (result == -1) {
            System.out.println("\nReward # not found.Your total is still " + totalPrice);
            System.out.println("\nPlease enter payment amount: ");
            double changePrice = test.calculate();
            System.out.println("\nChange returned: $" + df.format(changePrice));
            System.out.println(" \nThank you, have a nice day!");

        } else if (result != -1){
            test.discountTotal(bagPrice);
            double discountPrice = test.calculate();
            System.out.println("\nReward # found. Your new total is: $ " + df.format(discountPrice));
            System.out.println("\nPlease enter amount you are paying: ");
            test.changeTotal(discountPrice, 50);
            double changePrice = test.calculate();
            System.out.println("\nChange returned : $" + roundDown.format(changePrice));
            System.out.println("\nThank You, Have a nice day!");
        }
    }
}