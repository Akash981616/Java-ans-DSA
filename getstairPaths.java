import java.util.*;
/**
 * getstairPaths
 */
public class getstairPaths {
public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
    ArrayList<String>ans=getpaths(n);
    System.out.println(ans);
    scn.close();

}

private static ArrayList<String> getpaths(int n) {
    if(n==0){
        ArrayList<String>bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    if(n<0){
        ArrayList<String>bres=new ArrayList<>();
        return bres;

    }
    ArrayList<String>path1=getpaths(n-1);
    ArrayList<String>path2=getpaths(n-2);
    ArrayList<String>path3=getpaths(n-3);
    ArrayList<String>paths=new ArrayList<>();
    for(String pathing :path1){
        paths.add(1+pathing);

    }
    for(String pathing :path2){
        paths.add(2+pathing);

    }
    for(String pathing :path3){
        paths.add(3+pathing);

    }
    

    return paths;
}
    
}