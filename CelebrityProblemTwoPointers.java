// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
     static boolean knows(int M[][],int a, int b)  
    { 
        boolean res = (M[a][b] == 1) ?true:false; 
        return res; 
    } 
  
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
     int i = 0, j = 0;
    while (i < n && j < n) {
        if (M[i][j] == 1) 
            i = j;
        j++;
    }
    if (i == n) return -1;
    for (j = 0; j<n; j++) {
        if (M[i][j] == 1 || i != j && M[j][i] == 0)
        return -1;
    }
    return i;
    }
}