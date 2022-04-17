import java.io.*;
import java.util.*;
public class Main {
 private static void create_Zarr(String str, int[] Z) 
        int n = str.length();
        // [left,right] make a window which matches with
        // prefix of s
        int left = 0, right = 0;
        for(int i = 1; i < n; ++i) {
            // if i>right nothing matches so we will calculate.
            // Z[i] using naive way.
            if(i > right){
                left = right = i;
                while(right < n && str.charAt(right - left) == str.charAt(right))
                    right++;
                Z[i] = right - left;
                right--;
            }
            else{
                // k = i-left so k corresponds to number which
                // matches in [left,right] interval.
                int k = i - left;

                if(Z[k] < right - i + 1)
                    Z[i] = Z[k];
                else{
                // else start from right and check manually
                    left = i;
                    while(right < n && str.charAt(right - left) == str.charAt(right))
                        right++;
                    Z[i] = right - left;
                    right--;
                }
            }
        }
    }
  public static void solution(String txt, String pat) {
  String concat = pat + "$" + txt;
  int l=concat.length();
  int Z[]=new int[l];
  create_Zarr(concat,Z);
  for(int i=0;i<l;i++){
      if(Z[i]==pat.length()){
          System.out.println(i-pat.length()-1);
      }
  }
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = scn.nextLine();
    String s2 = scn.nextLine();
    solution(s1, s2);
    System.out.println();
	}

}