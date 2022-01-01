import java.util.*; 
public class sort01 {
      public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01s(arr);
    print(arr);
    scn.close();
  }



private static void sort01s(int[] arr) {
    int i=0;
    int j=0;
    while(i<arr.length){
if (arr[i]==0) {
    swap(arr,i,j);
    i++;
    j++;
}else if(arr[i]==1){

i++;


}
    }
}
private static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

private static void print(int arr[]){
    for (int x:arr){
        System.out.println(x);
    }
}
}
