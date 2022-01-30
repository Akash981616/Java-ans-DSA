import java.util.*;
public class ArrayIntersection {
    public static void main(String[] args) {
        int nums1[]={9,4,9,8,4};
        int nums2[]={4,9,5};
        int res[]=intersection(nums1,nums2);
        for(int x:res){
           System.out.println(x);
        }
      //   HashMap<Integer, Integer> fmap = new HashMap<>();
      //   HashMap<Integer, Integer> rmap = new HashMap<>();
      //   for(int val: nums1){
      //      if(fmap.containsKey(val)){
      //        int of = fmap.get(val);
      //        int nf = of + 1;
      //        fmap.put(val, nf);
      //      } else {
      //         fmap.put(val, 1);
      //      }
      //   }
    
      //   for(int val: nums2){
      //      if(fmap.containsKey(val) && fmap.get(val) > 0){
      //         int of=fmap.get(val);
      //         int nf=of-1;
      //         fmap.put(val,nf);
      //           rmap.put(val,nf);
             
      //      }
      //   }
    
     }

    // }
    // class Solution {
        public static int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i: nums1){
                set.add(i);
            }
            
            HashSet<Integer> intersection = new HashSet<Integer>();
            for(int i: nums2){
                if(set.contains(i)){
                    intersection.add(i);
                }
            }
            int[] result = new int[intersection.size()];
            int index = 0;
            for(int i: intersection){
                result[index++] = i;
            }
            
            return result;
        }
    }