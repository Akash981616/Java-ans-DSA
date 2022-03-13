package Tree;

class Solution {
    public int waysToMakeFair(int[] nums) {
        int count=0;
        int n=nums.length;
        int even[]=new int[n];
        int odd[]=new int[n];
        int evensum=0;
        int oddSum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                 evensum+=nums[i];
            }else{
                oddSum+=nums[i];
            }
            even[i]=evensum;
            odd[i]=oddSum;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                int eve=even[n-1]-nums[i];
                int od=odd[n-1]-nums[i];
                if(eve==od){count++;}
                    continue;
            }
            int eve=even[i-1]+odd[n-1]-odd[i];
            int od=odd[i-1]+even[n-1]-even[i];
            if(eve==od)count++;}
  
        return count;
    }
  }