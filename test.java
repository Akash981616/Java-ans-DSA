public class test {
    public static void main(String[] args) {
        String s="loveleetcode";

        // int nums[]={1,1,1,2,2,3};
        String ransomNote = "aab";
        String magazine = "aa";
        System.out.print(canConstruct(ransomNote,magazine));
    }
//     public static int firstUniqChar(String s) {
//         for(char c : s.toCharArray()){
//            int index = s.indexOf(c);
           
//            int lastIndex = s.lastIndexOf(c);
//            if(index == lastIndex)
//                return index;
//        }
//        return -1;
// }
//     public static int removeDuplicates(int[] nums) {
//         // int s=2;
//         // for (int i = s; i < nums.length; i++) {
//         //     if(nums[i]!=nums[s-2]){
//         //         nums[s++]=nums[i];
//         //     }
//         // }
//         // return s;
//         int i = 0;
//         for (int n : nums)
//            if (i < 2 || n > nums[i - 2])
//               nums[i++] = n;
//         return i;
     
    
// }
public static boolean canConstruct(String ransomNote, String magazine) {
int r = ransomNote.length();
int m = magazine.length();

int[] arr = new int[26];

for(char ch : magazine.toCharArray()) {
    arr[ch - 'a']++;
}

for(char ch : ransomNote.toCharArray()) {
    if(arr[ch - 'a'] == 0)
        return false;
    arr[ch - 'a']--;
}
return true;
}
}
