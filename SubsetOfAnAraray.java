import java.util.Scanner;
public class SubsetOfAnAraray {
    public static void main (String[]args) throws Exception
  {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int[] arr = new int[n];
    scn.close();
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = scn.nextInt ();
    }
    int limit = (int) Math.pow (2, arr.length); //calculating the number of subsets
    for (int i = 0; i < limit; i++)
    {
      //convert i to binary and use 0's and 1's
      //to check if an array's element is to be printed or not
      String set = "";
      // we make use of set to print in required order
      int temp = i;
      // we store i because we need to use value
      // of i without manipulating the actual i
      // as i is the outer loop iterator
      for (int j = arr.length - 1; j >= 0; j--)
      {
        //calculating the binary, extracting //
        // the remainder one and by one
        // and putting required element
        // in the String to be printed.
        int rem = temp % 2;
        temp = temp / 2;
        if (rem == 0)   //nothing to be printed
        {
          set = "-    " + set;
        }
        else
        {
          // we print the element, so we add it to our answer string
          set = arr[j] + "    " + set;
        }
      }
      System.out.println (set);
      // printing the required pattern line-by-line
    }
        
    }}

