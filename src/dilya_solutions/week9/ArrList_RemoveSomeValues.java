package dilya_solutions.week9;

import java.util.ArrayList;

public class ArrList_RemoveSomeValues {
    public static void removeOver100(ArrayList<Integer>nums){
        nums.removeIf(x->x>100);
        System.out.println(nums);
    }
    public static ArrayList<Integer> removeOver100_2(ArrayList<Integer>nums){
        nums.removeIf(x->x>100);
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            nums.add(i);
        }
        removeOver100(nums);
        System.out.println(removeOver100_2(nums));
    }
}
