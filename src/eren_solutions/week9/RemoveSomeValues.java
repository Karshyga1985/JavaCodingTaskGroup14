package eren_solutions.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {

    /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ...etc. Remove all values greater than 100.
     */

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823));
        System.out.println(removeMoreThan100(nums));

    }

    public static List<Integer> removeMoreThan100(List<Integer> nums) {

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            if (it.next() > 100) {
                it.remove();
            }
        }
        return nums;
    }

    // removeIf(p -> p > 100)

}
