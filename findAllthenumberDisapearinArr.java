import java.util.*;
/**
 * findAllthenumberDisapearinArr
 */
public class findAllthenumberDisapearinArr {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []nums=new int[n];
        // int[]nums =new ArrayList<Integer>(n);
        // for(int i = 0 ;i < n; i++){
        //   nums.add(scn.nextInt()); 
        // }
        findDisappearedNumbers(nums);
        // print(nums);
        scn.close();
      }

      public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        
        int idx = 0;
        
        while (idx < nums.length) {
            if (nums[idx] != nums[nums[idx] - 1]) {
                swap(nums, idx, nums[idx] - 1);
            } else {
                idx++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
    
    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}