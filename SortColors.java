// https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
            
            int i=0;
            int k=nums.length-1;
            int j=0;
            while(i<=k){
                    if(nums[i]==0){
                           swap(nums,i,j);
                            i++;
                            j++;
                    }
                    else if(nums[i]==1){
                            i++;
                            
                    }else {
                            swap(nums,i,k);
                            k--;
                            
                    }  
            }  
    }
      
        public static void swap(int nums [],int first,int sec){
                int temp=nums[first];
                nums[first]=nums[sec];
                nums[sec]=temp;
                
        }
}