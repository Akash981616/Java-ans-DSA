import java.util.Scanner;
public class AllPermutations {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str=scn.next();
        solution(str);
        scn.close();

    }

    private static void solution(String str) {
        int n=factorial(str.length());
       
        for (int i = 0; i < n; i++) {
            StringBuilder d=new StringBuilder(str);
            int dvd=i;
            for (int div = str.length(); div >= 1; div--) {
                int q = dvd / div;
                int r = dvd % div;
                System.out.print(r);
                dvd = q;
                d.deleteCharAt(r);

            }
            StringBuilder ans = new StringBuilder();
            ans.equals())
              System.out.println();
            
        }
    }
    public static int factorial (int n) {
        int ans=1;
        for (int i = 2; i <=n; i++) {
            ans=ans*i;
        }                                                                                                                    
        return ans;
        
    }

}
