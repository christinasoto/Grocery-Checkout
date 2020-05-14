/**
 *
 * Aides GroceryCheckout by determining whether a reward member # is valid or not.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 * @version 8.0.0
 * @since 05-14-2020
 */

public class RewardCard {
public static <TheType extends Comparable<TheType>>
int binarySearch(TheType x){

        //all possibilities of last four digits of a card reward number
        String[] arr = {"1230", "1231", "1232", "1233", "1234", "1235", "1236", "1237", "1238", "1239"};
        //binary search to find if member discount is valid
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = 1 + (r - 1) / 2;
            int res = x.compareTo((TheType) arr[m]);
            //check if x is present at mid
            if (res == 0)
                return m;
            //if x is greater, ignore left half
            if (res > 0)
                l = m + 1;
                //if x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;

    }


}
