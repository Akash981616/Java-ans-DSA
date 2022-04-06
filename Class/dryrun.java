package Class;

/**
 * dryrun
 */
import java.util.*;
public class dryrun {
;
    
    System.out.println(~n);

    //  System.out.println(numberOfConnections(gridOfNodes));
        //getFactorail(3);
}
public static void rearrange(int arr[], int n){
    int max_index=n-1;
    int min_index=0;
    int max=arr[n-1]+1;
    System.out.println(31/max+"fdsfsdfs");
    for(int i=0;i<n;i++){
          if(i%2==0){
          arr[i]=(int)(arr[max_index]%max)*max+arr[i]; 
          max_index--;
          }else{
          arr[i]=(int)(arr[min_index]%max)*max+arr[i]; 
          min_index++;
          }
    }
        for(int i=0;i<n;i++){
          //  arr[i]/=max;
                        System.out.println(arr[i]);
        }
        
    }
public static int numberOfConnections(List<List<Integer>> gridOfNodes)
    {
        int n = gridOfNodes.size();
        int m = gridOfNodes.get(0).size();

        // array for storing number of 1's in each row
        int rowCounts[] = new int[n];

        int i = 0;
        for(List<Integer> x: gridOfNodes)
        {
            int count = 0;
            for(int y: x)
            {
                if(y == 1)
                    count++;
            }
            rowCounts[i++] = count;
        }

        int prev = -1, answer = 0;

        // finding the first non-zero number in rowCounts
        for(i = 0;i < n;i++)
        {
            if(rowCounts[i] != 0)
            {
                prev = rowCounts[i];
                break;
            }
        }

        i++;
        // multiplying every non-zero rowCounts with previous non-zero rowCounts
        for(;i < n;i++)
        {
            if(rowCounts[i] != 0)
            {
                answer += prev * rowCounts[i];
                prev = rowCounts[i];
            }
        }

        return answer;
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
