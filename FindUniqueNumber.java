public class FindUniqueNumber {
  public static void main(String[] args) {
      int arr[]={2,4,7,8,7,8,2};
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
