package Class;

/**
 * dryrun
 */
import java.util.*;
public class dryrun {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        //subsets(nums );
    System.out.println(18%6);
    //      List<List<Integer>>gridOfNodes=new ArrayList<>();
    //      List<Integer>r1=new ArrayList<>();
    //      r1.add(1);
    //      r1.add(1);
    //      r1.add(1);
    //      List<Integer>r2=new ArrayList<>();
    //      r2.add(0);
    //      r2.add(1);
    //      r2.add(0);
    //      List<Integer>r3=new ArrayList<>();
    //      r3.add(0);
    //      r3.add(0);
    //      r3.add(1);
    //      List<Integer>r4=new ArrayList<>();
    //      r4.add(1);
    //      r4.add(1);
    //      r4.add(0);
    //      gridOfNodes.add(r1);
    //      gridOfNodes.add(r2);
    //    gridOfNodes.add(r2);
    //    gridOfNodes.add(r3);


    //     System.out.println(numberOfConnections(gridOfNodes));
        //getFactorail(3);
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
