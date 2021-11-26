import java.util.*;
public class removeDuplicatenumbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scn.nextInt();
        }

       int j= removeDuplicates(nums);
       System.out.println(j);
    scn.close();

    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
    
        int j = 0;
        for (int val: nums) {
            if (val > nums[j]) {
                nums[++j] = val;
            }
        }
      for(int x:nums)
      System.out.println(x);
        return ++j;
    }
}
