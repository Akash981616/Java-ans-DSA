import java.util.Scanner;
public class firstIndexInRecu {

    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
    
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = firstIndex(arr, 0, x);
        System.out.println(fi);
        scn.close();
      }
    
      public static int firstIndex(int[] arr, int idx, int x) {
    
        if (idx == arr.length)
        {
          return -1;
        }
    
    
        if (arr[idx] == x)
        {
          return idx;
        }
    
        int fiisa = firstIndex(arr, idx + 1, x);
    
        return fiisa;
      }
    
    
}

