import java.io.*;
import java.util.*;

public class Main {

  public static String solution(String s) {
    String temp = s + "#" + new StringBuilder(s).reverse().toString();
    int[] table = getTable(temp);

    return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
  }
  public static int[] getTable(String p){
 int[] lps = new int[p.length()];
		int i = 1;
		int len = 0;

		while (i < p.length()) {
			if (p.charAt(i) == p.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len > 0) {
					len = lps[len - 1];
				} else {
					i++;
				}
			}
		}
		return lps;
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}