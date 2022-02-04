class Solution {
  public int minMoves(int target, int maxDoubles) {
          int ans=0;
      while(target>1&&maxDoubles>0){
              ans+=1+(target%2);
              target=target/2;
              maxDoubles--;

      }
          System.out.println(ans);
          return ans+target-1;
  }
}