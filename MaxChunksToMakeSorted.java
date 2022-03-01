class Solution {
    public int maxChunksToSorted(int[] arr) {
    int[] rmin = new int[arr.length + 1];
        
        int val = Integer.MAX_VALUE;
        rmin[arr.length] = val;
        for(int i = arr.length - 1; i>= 0; i--) {
            val = Math.min(val, arr[i]);
            rmin[i] = val;
        }
        int count=0;
            int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
                max=Math.max(max,arr[j]);
                        if(max<=rmin[j+1])count++;
        }
        return count;
  }
}