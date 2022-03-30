package Class;

/**
 * dryrun
 */
import java.util.List;
import java.util.*;
public class dryrun {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        //subsets(nums );
        getFactorail(3);
}
public static void getFactorail(int n){
    int fact[]=new int[n+1];
    fact[0]=0;
    fact[1]=1;
     for(int i=2;i<=n;i++){
         fact[i]=i*fact[i-1];
     }
    }
public static int findDuplicate(int[] nums) {
    int i = 0;
    while (i < nums.length) {
        if (nums[i] != nums[nums[i]]) 
        swap(nums, i, nums[i]);
        else i++;
    }
    return nums[0];
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
        }
        
        private static void dfs(int[] nums, int idx, List<Integer> path, List<List<Integer>> res) {
        res.add(path);
        
        for (int i = idx; i < nums.length; i++) {
            List<Integer> p = new ArrayList<>(path);
            p.add(nums[i]);
            dfs(nums, i+1, p, res);
        }
        }
    
}
