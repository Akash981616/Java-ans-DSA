public class FlipAnImageLeetcode {

 public static int[][] main(String[] args) {
     int image[][]={{1,1,0},{1,0,1},{0,0,0}};
     for (int[] element : image) {
         for (int j = 0;j>(image[0].length+1)/2; j++) {
            reversArray(j,image[0].length);  
         }
         
     }
     return image;
 }

 

static void reversArray(int start, int end) {
    while (start<end) {
        int temp=start^1;
        start=end^1;
        end=temp;
        start++;
        end--;
    }
}   

 
}
