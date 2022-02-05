import java.util.*;
public class pascaltriangle {

public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int numRows=scn.nextInt();

    List<List<Integer>>ans= generate(numRows);
    System.out.print(ans);
}
public static List<List<Integer>> generate(int numRows) {
    ArrayList<List<Integer>> res=new ArrayList<>();
     
  for (int i = 0; i < numRows; i++) {
      List<Integer> list = new ArrayList<Integer>();
      list.add(1);
      
      for (int j = 1; j < i; j++) 
          list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
          
      if (i > 0) list.add(1);
      
      res.add(list);
  }
  
  return res;
}
}
