/**
 * Aides GroceryCheckout by implementing methods to be calculated.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 * @version 8.0.0
 * @since 05-14-2020
 */

public abstract class CalculatePrice implements BagPrice, Discount, Change{
    protected double total;
    protected double discount = .05;

    CalculatePrice(){

        total = 1;
    }
public void discountTotal(double y){
        try{
            total = y- (y*discount);
        }catch(Exception e){
            System.out.println(e);{
                System.out.println(e);
            }
        }
}
public void changeTotal(double y, double z){
        try {
            total = z - y;
        }catch(Exception e){
            System.out.println(e);
        }
}
public void bagTotal(double y, int numBags){
        try{
            total = y + (.10 * numBags);
        }catch(Exception e){
            System.out.println(e);
        }
}
abstract double calculate();
}
