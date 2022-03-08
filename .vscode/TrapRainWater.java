package .vscode;

class Solution {
    public int trap(int[] height) {
            int n=height.length;
            int Rmax=0;
            int MaxIndex=0;
            int totalWater=0;
             for(int i=0;i<n;i++){
                    if(Rmax<height[i]){
                   Rmax=height[i];
                    MaxIndex=i;
                    }
            }
           int Leftmax=0;
        for(int i=0;i<MaxIndex;i++){
        Leftmax=Math.max(Leftmax,height[i]);
                int water=Math.min(Leftmax,Rmax)-height[i];
                totalWater+=water;
        }
            Leftmax=0;
            for(int i=n-1;i>=MaxIndex;i--){
        Leftmax=Math.max(Leftmax,height[i]);
                int water=Math.min(Leftmax,Rmax)-height[i];
                totalWater+=water;
        }
       return totalWater; 
    }
}
class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        if(n<3){
            return 0;
        }
        int leftMax = heights[0];
        int rightMax = heights[n-1];
        int l = 1;
        int r = n-2;
        
        int trappedWater = 0;
        while(l<=r){
            if(leftMax<rightMax){
                if(heights[l]>leftMax){
                    leftMax = heights[l];
                } else {
                    trappedWater+=(leftMax-heights[l]);
                }
                l++;
            } else {
                if(heights[r]>rightMax){
                    rightMax = heights[r];
                } else {
                    trappedWater+=(rightMax-heights[r]);
                }
                r--;
            }
        }
        
        return trappedWater;
    }
}