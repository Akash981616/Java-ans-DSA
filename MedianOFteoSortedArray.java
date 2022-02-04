class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
       if (a.length > b.length) {
      int[]temp = a;
      a = b;
      b = temp;
    }

    //write your code here
    int lo = 0;
    int hi = a.length;
    int te = a.length + b.length;

    while (lo <= hi) {
      int aleft = (lo + hi) / 2;
      int bleft = (te + 1) / 2 - aleft;

      int alm1 = (aleft == 0) ? Integer.MIN_VALUE : a[aleft - 1];
      int al = (aleft == a.length) ? Integer.MAX_VALUE : a[aleft];
      int blm1 = (bleft == 0) ? Integer.MIN_VALUE : b[bleft - 1];
      int bl = (bleft == b.length) ? Integer.MAX_VALUE : b[bleft];

      //valid segregation
      if (alm1 <= bl && blm1 <= al) {
        double median = 0.0;

        if (te % 2 == 0) {
          int lmax = Math.max(alm1, blm1);
          int rmin = Math.min(al, bl);
          median = (lmax + rmin) / 2.0;
        }
        else {
          int lmax =  Math.max(alm1, blm1);
          median = lmax;
        }

        return median;
      }
      else if (alm1 > bl) {
        //there are more elements to be picked in left part 'b' array
        hi = aleft - 1;
      }
      else if (blm1 > al) {
        //there are more element to be picked in left part from 'a' array
        lo = aleft + 1;
      }
    }
    return 0;
  }

}