public class FindUniwue {
  public static void main(String[] args) {
      int arr[]={2,4,7,8,7,8,2,4,5,9,6,6};
      System.out.println(ans(arr));
  }

private static int ans(int[] arr) {
    int unique=0;
for(int x:arr){
    unique^=x;
}
    return unique;
}  
}
