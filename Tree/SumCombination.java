package Tree;

/**
 * 3SumCombination943
 */
public class SumCombination {
public static void main(String[] args) {
    //https://leetcode.com/problems/3sum-with-multiplicity/
    class Solution {
        public int threeSumMulti(int[] arr, int target) {
                long ans=0;
                long modulo=1000000000+7;
                 long count[]=new long [101];
                for(int x:arr){
                        count[x]++;
                }
               for(int i=0;i<101;i++){
                       for(int j=i;j<101;j++){
                       int k=target-i-j;
                               if(k<0||k>100) continue;
                               if(i==j&&k==j){
                                       ans+=(count[i]*(count[i]-1)*(count[i]-2))/6;
                               }else if(i==j&&j!=k){
                                ans += ((count[i]*(count[i]-1))/2)*count[k];  
                               }else if(i<j&&j<k){
                                         ans += (count[i]*count[j]*count[k]);
                                      
                               }
                               ans%=modulo;
                       }
               }
            return(int) ans;
        }
    }
}
    
}