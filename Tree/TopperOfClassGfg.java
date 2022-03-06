package Tree;
import java.util.*;


public class TopperOfClassGfg {
public static class Pair implements Comparable<Pair> {
     int marks;
    int idx;
   
    Pair(int marks,int idx){
        this.marks=marks;
        this.idx=idx;
    }
   
   public int compareTo(Pair o) {
      if (this.marks != o.marks) {
        return this.marks - o.marks;
      }
      else {
        return o.idx - this.idx;
      }
    }
 }
  public static int[] kToppers(int[]marks, int k) {
   PriorityQueue<Pair>q = new PriorityQueue<>();
  for (int i = 0; i < marks.length; i++) {
      if (q.size() < k) {
        q.add(new Pair(marks[i], i));
      }
      else if (q.peek().marks < marks[i]) {
        q.remove();
        q.add(new Pair(marks[i], i));
      }
    }
   int res[]=new int[k];
  int idx = k - 1;
   while(idx>=0){
       res[idx]=q.remove().idx;
       idx--;
   }
    return res;
  }

  public static void main(String[]args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[]marks = new int[n];

    for (int i = 0; i < n; i++) {
      marks[i] = scn.nextInt();
    }

    int k = scn.nextInt();

    int[]ans = kToppers(marks, k);

    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }

  }
}