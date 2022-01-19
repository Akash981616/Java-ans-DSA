
public class RotateImageLeetcoode {
    public static int[][] main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                // tanspose
               int temp= matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            int li=0;
            int hi=matrix[0].length-1;
            while (li<hi) {
                int temp=matrix[i][li];
                matrix[i][li]=matrix[i][hi];
                matrix[i][hi]=temp;
                li++;
                hi--;
            }
        }
        return matrix;
    }
}
