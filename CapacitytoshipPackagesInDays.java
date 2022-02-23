class Solution {
    public int shipWithinDays(int[] weights, int days) {
           int max=Integer.MIN_VALUE;
            int sum=0;
            for(int x:weights){
                    sum+=x;
                    max=Math.max(max,x);
            }
        int ans=0; int start=max;int end=sum;
         while(start<=end){
                 int mid=start+(end-start)/2;
                 if(isPossible(weights,mid,days)){
                         ans=mid;
                         end=mid-1;
                         
                 }else{
                      start=mid+1;   
                 }
         }
            
            
            return ans;
    }
        public static boolean isPossible(int weights[],int limit,int day){
                int d=1;
                int sum=0;
                for(int i=0;i<weights.length;i++){
                        sum+=weights[i];
                        if(sum>limit){
                                d++;
                                sum=weights[i];
                        }
                }
                return d<=day;
        }
        
}