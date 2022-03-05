class Solution {
    public int deleteAndEarn(int[] nums) {
        
            int ans=0;
          int[] values = new int[100001];
        for (int num : nums){
            values[num] += num;}
          int prev1=0;
           int prev2=0;
                   for(int x:values){
                         
                           int temp=prev1;
                           prev1=Math.max(prev2+x,prev1);
                           prev2=temp;
                   }
            return prev1;
    }
}