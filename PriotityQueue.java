import java.util.*;



public class PriotityQueue {

   public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = scn.nextInt();
      }

      int k = scn.nextInt();
      PriorityQueue<Integer> sq=new PriorityQueue<>();
      for(int i=0;i<arr.length;i++){
          if(i<k){
              sq.add(arr[i]);
          }else{
              if(arr[i]>sq.peek()){
                    sq.remove();
                    sq.add(arr[i]);
              }
          }
      }
      while(sq.size()>0){
          System.out.println(sq.remove());
      }
      scn.close();
    }

}