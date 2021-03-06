package Class;

import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int count = find(nums,0,l1,l2);
        
        return l2;
    }
    
    public static int find(int nums[] , int idx , List<Integer> l1 , List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> lk = new ArrayList<Integer>(l1);
            // for(int i = 0;i<l1.size();i++){
            //     lk.add(l1.get(i));
            // }
            ans.add(lk);
            return 1;
        }
        
        
        int count = 0;
        int pre = -100;
        
        for(int i = 0;i<nums.length;i++){
            int val = nums[i];
            if(val > -11 && nums[i] != pre){
                nums[i] = -11;
                l1.add(val);
                count+=find(nums,idx+1,l1,ans);
                nums[i] = val;
                pre = val;
                l1.remove(l1.size() - 1);
            }
        }
        
        return count;
    }
}
public class QueensSubsequence {

  public static int queensPalceCombination1D(int[] arr, int idx, int q, int qsf, String psf) {
		if(idx == arr.length || qsf == q) {
			if(qsf == q) {
				System.out.println(psf);
				return 1;				
			}
			return 0;
		}
		int count = 0;
		// 1st method
//		for(int i = idx; i < arr.length; i++) {
//			String path = "q" + qsf + "b" + i;
//			count += queensPalceCombination1D(arr, i + 1, q, qsf + 1, psf + path + " ");
//		}
		// 2nd method
		String path = "q" + qsf + "b" + idx;
		count += queensPalceCombination1D(arr, idx + 1, q, qsf + 1, psf + path + " ");
		count += queensPalceCombination1D(arr, idx + 1, q, qsf, psf);
		return count;
	}

  public static int queensPalcePermutaion1D(int[] arr, int q, int qsf, String psf) {
		if(qsf == q) {
			System.out.println(psf);
			return 1;
		}
		int count = 0;
		for(int boxIdx = 0; boxIdx < arr.length; boxIdx++) {
			if(arr[boxIdx] != -1) {
				arr[boxIdx] = -1;
				String path = "q" + qsf + "b" + boxIdx; 
				count += queensPalcePermutaion1D(arr, q, qsf + 1, psf + path + " ");
				arr[boxIdx] = 0;
			}
		}
		return count;
	}
	
	public static int queensPalcePermutaion1D_Sub(int[] arr, int boxIdx, int q, int qsf, String psf) {
		if(boxIdx == arr.length || qsf == q) {
			if(qsf == q) {
				System.out.println(psf);
				return 1;				
			}
			return 0;
		}
		int count = 0;
		if(arr[boxIdx] != -1) {
			arr[boxIdx] = -1;
			String path = "q" + qsf + "b" + boxIdx; 
			count += queensPalcePermutaion1D_Sub(arr, 0, q, qsf + 1, psf + path + " ");
			arr[boxIdx] = 0;
		}
		count += queensPalcePermutaion1D_Sub(arr, boxIdx + 1, q, qsf, psf);
		return count;
	}

  public static void main(String[] args) {
    // Write your code here
    int n = 6;
		int q = 3;
		int[] arr = new int[n];
//		System.out.println(queensPalceCombination1D(arr, 0, q, 0, ""));
//		System.out.println(queensPalcePermutaion1D(arr, q, 0, ""));
		System.out.println(queensPalcePermutaion1D_Sub(arr, 0, q, 0, ""));
  }
}