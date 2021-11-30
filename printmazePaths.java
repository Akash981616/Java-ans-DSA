import java.util.*;
/**
 * printmazePaths
 */
public class printmazePaths {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=n;
    mazePaths(0,0,n-1,m-1,"");
    scn.close();
}
        // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
private static void mazePaths(int sr, int sc, int dr, int dc, String ans) {
    if (sr > dr || sc > dc) {
        return;
      }
  
      if (sr == dr && sc == dc) {
        System.out.println(ans);
        return;
      }
      mazePaths(sr, sc + 1, dr, dc, ans + "h");
      mazePaths(sr + 1, sc, dr, dc, ans + "v");
    
}
}