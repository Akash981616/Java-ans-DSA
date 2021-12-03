import java.util.*;
public class printMazewithjumps {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazewithjump(0,0,m,n,"");
        scn.close();
    }

    private static void printMazewithjump(int sr, int sc, int dr, int dc,String ans) {
        if (sc==dc&&sr==dr) {
            System.out.println(ans);
            return;
            
        }
        if (sr<dr&&sc<dc) {
            return;
            
        }
        for (int move= 1; move<=dc-sc ; move++) {
            printMazewithjump(sr,sc+move,dr,dc,ans+"h"+move);
        }
        for (int move= 1; move<=dr-sr ; move++) {
            printMazewithjump(sr+move,sc,dr,dc,ans+"v"+move);
        }
        for (int move= 1; move<=dc-sc&&move<dr-sr; move++) {
            printMazewithjump(sr, sc, dr, dc, ans);
        }
     
        


    }
}
