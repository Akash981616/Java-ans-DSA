import java.util.Scanner;
public class ceilFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
          array[i] = scn.nextInt();
          scn.close();
    
        }
    
        int data = scn.nextInt();
        int l = 0;
        int h = array.length - 1;
        int floor = Integer.MIN_VALUE;
        int ciel = Integer.MAX_VALUE;
        while (h >= l) {
          int mid = h + l / 2;
          if (data < array[mid]) {
            h = mid - 1;
            ciel = array[mid];
          } else if (data > array[mid])
          { l = mid + 1;
            floor = array[mid];
    
          }
          else {
            ciel = floor = array[mid];
            break;
          }
        }
        System.out.println(ciel);
        System.out.println(floor);
    
    
      }
    
    
}
