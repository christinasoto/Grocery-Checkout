/**
 * Tests methods that are used in GroceryCheckout.
 * Methods include bag fee, reward member search, reward member discount, and change returned.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 * @version 8.0.0
 * @since 05-14-2020
 */

public class UnitTest {
    public static void main(String args[]) {
        bagTotalTest();
        discountTotalTest();
        changeTotalTest();
        rewardCardTest();
    }
         //tests bag fee
        public static void bagTotalTest(){
            Calculate test = new Calculate();
            test.bagTotal(25.65, 2);
            if (test.calculate() < 25.65)
                System.out.println("\nBag fee not correctly applied.");
            else System.out.println("\nBag fee correctly applied.");
        }
        //tests reward member discount
    public static void discountTotalTest() {
        Calculate test = new Calculate();
        test.discountTotal(25.00);
        if (test.calculate() != 23.75)
            System.out.println("\nFailed to apply reward member discount.");
        else System.out.println("\nReward member discount correctly applied.");
        }
        //test for change amount
    public static void changeTotalTest() {
        Calculate test = new Calculate();
        test.changeTotal(23.75, 50.00);
        if (test.calculate() != 26.25)
            System.out.println("\nFailed to return correct change amount.");
        else System.out.println("\nCorrect amount of change returned.");

    }
    public static void rewardCardTest(){
        RewardCard test = new RewardCard();
        if(test.binarySearch("1231") != -1)
            System.out.println("\nReward Member Search correctly completed.");
        else System.out.println("\nReward Member Search failed.");
    }

}
