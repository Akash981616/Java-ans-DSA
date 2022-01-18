import java.util.*;
public class baseDidgitNumber {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n!=0){
          n=n>>1;
          count++;
        }
        System.out.println(count);
    }
}
