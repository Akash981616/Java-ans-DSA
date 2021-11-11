import java.util.ArrayList;
import java.util.Scanner;

public class RemoveallPrimes {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i<n;i++) {
            list.add(scn.nextInt());
        }
        solution(list);
        System.out.print(list);
    }
    
    private static void solution(ArrayList<Integer> list) {
       for (int i = list.size()-1; i >=0; i--) {
           int val=list.get(i);
        if(IsPrime(val)==true){
               list.remove(i);
    
               
           }
           
           
       }
    
    }
    public static boolean IsPrime(int val){
        for (int i = 2; i*i <val;i++) {
              if (val%i==0) {
                  return false;
                  
              }
             
        }
        
    return true;
    }
    
} 




