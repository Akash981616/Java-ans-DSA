public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high=Integer.MAX_VALUE;
            int low=1;
            while(low<=high){
                    int mid=low+(high-low)/2;
                    if(guess(mid)==0){
                    return mid;    
                    }
                    if(guess(mid)==1){
                            low=mid+1;
                    }else{
                    high=mid-1;            
                    }
            }
            return  -1;
    }
}