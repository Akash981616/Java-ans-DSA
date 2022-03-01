class Solution {
    public int[] countBits(int n) {
       int res[]=new int [n+1];
        for(int i=0;i<=n;i++){
                if((i&1)==1){
                     res[i]=1+res[i/2];   
                }
                else{
                   res[i]=res[i/2];     
                }
         }
            return res;
    }
}