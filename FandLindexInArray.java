import java.util.Scanner;
public class FandLindexInArray {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[]arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        scn.close();

        int l = 0;
        int h = arr.length - 1;
       int  fi=-1;
    //FOR FIRST INDEX
            while (l <= h) {
          int m = (l + h) / 2;
          if (data > arr[m]) {
            l = m + 1;
          } else if (data < arr[m]) {
            h = m - 1;
          } else {
              fi=m;
              h=m-1;
        
          }
        }
        
                //FOR LAST INDEX
                int li=-1;
                        while (l <= h) {
                    int m = (l + h) / 2;
                    if (data > arr[m]) {
                        l = m + 1;
                    } else if (data < arr[m]) {
                        h = m - 1;
                    } else  {
                        li=m;
                        l=m+1;

                    }
                    }
                    
        System.out.println(fi);
        System.out.println(li);
      }
}