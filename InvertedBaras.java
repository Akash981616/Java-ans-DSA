import java.util.Scanner;
public class InvertedBaras {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        scn.close();
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }

              for (int i = 0; i < max; i++) {
                  for(int x:arr){
                      if(i<x){
                          System.out.print("*\t");
                      }
                      else{
                          System.out.print(" \t");
                      }                                             
                  }
                  System.out.println();
           }
            
                
        }
    }
    

