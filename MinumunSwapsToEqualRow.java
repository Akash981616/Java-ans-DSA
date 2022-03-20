class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
      int c1=0, c2=0,c3=0,c4=0;
             int swapsCheack1=swaps(tops,bottoms,0,0,tops[0]); //getting the Minimum  no swaps for tops array equal
             int swapsCheack2=swaps(tops,bottoms,0,0,bottoms[0]);//getting the Minimum  no swaps for bottom array equal
            int ans=Math.min(swapsCheack1,swapsCheack2);
            return ans==Integer.MAX_VALUE?-1:ans;
    }
        public static int swaps(int[] tops, int[] bottoms,int count1,int count2,int target){
                for(int i=0;i<tops.length;i++){
                      if(count1!=Integer.MAX_VALUE){
                        if(tops[i]==target){
                              
                        }else if(bottoms[i]==target){
                                  count1++;
                        }else{
                                count1=Integer.MAX_VALUE;
                        }
                      }
                     if(count2!=Integer.MAX_VALUE){
                        if(bottoms[i]==target){
                              
                        }else if(tops[i]==target){
                                  count2++;
                        }else{
                                count2=Integer.MAX_VALUE;
                        }
                      }
                }
               
                return Math.min(count1,count2);
        }
}