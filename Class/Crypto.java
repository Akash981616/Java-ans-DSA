package Class;
import java.util.*;
public class Crypto {
    public static int findDuplicate(int[] nums) {
            if(nums.length ==0 )
                return 0;
            int slow=0, fast=0;
            slow = nums[slow];
          
            fast = nums[nums[fast]];
          
            while(slow != fast){
                slow = nums[slow];
                 fast = nums[nums[fast]];
               
            }
            fast = 0;
            while(slow != fast){
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
    }
}
