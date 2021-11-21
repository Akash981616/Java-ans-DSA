import java.util.Scanner;
public class allindices {
    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);

        

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
        scn.close();

    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx==arr.length){
            return new int [fsf];
        }
        int iarr[];
       if (x==arr[idx]) {
       iarr=allIndices(arr,x,idx+1,fsf+1);
       iarr[fsf]=idx;
       } else {
       iarr= allIndices(arr,x,idx+1,fsf);
        
       }
    return iarr; 
       
    }
    
    
}
