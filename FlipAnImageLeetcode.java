public class FlipAnImageLeetcode {

 public static int[][] main(String[] args) {
     int image[][]={{1,1,0},{1,0,1},{0,0,0}};
     if (image == null || image.length == 0 || image[0].length == 0) {
        return image;
    }

    for (int[] row : image) {
        int start = 0;
        int end = row.length - 1;
        while (start <= end) {
            if (row[start] == row[end]) {
                row[start] ^= 1;
                row[end] = row[start];
            }
            start++;
            end--;
        }
    }

    return image;
}   

 
}
