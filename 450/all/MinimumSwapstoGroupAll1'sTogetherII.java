// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-i
class Solution {
    public int minSwaps(int[] nums) {
        int count=0;
            for(int x:nums){
                    if(x==1) count ++;
            }
            int ans=0,zeroes=0;
            for(int i=0;i<count;i++){
                    if(nums[i]==0){
                            zeroes++;
                    }
            }
            ans=zeroes;
            for(int i=count; i<2*nums.length;i++){
                    if(nums[i%nums.length]==0){
                            zeroes++;
                    }
                    if(nums[(i-count)%nums.length]==0){
                            zeroes--;
                    }
                                         ans=Math.min(ans,zeroes);

            }
            return ans;
    }
}