/**
 * MoveZereosToRightSide
 */
public class MoveZereosToRightSide {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int count=0;
    for(int x:nums){
       if(x>0){
       nums[count++]=x;
       
       }
       
    }
       while(count<nums.length){
           nums[count++]=0;
       }
    
    }
    
}