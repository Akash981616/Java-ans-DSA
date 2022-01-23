// https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
            String ans=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            int start=0;
            int end=ans.length()-1;
            while(start<end){
                    char c1 = ans.charAt(start);
                    char c2 = ans.charAt(end);
                    if(c1!=c2){
                            return false;
                    }
                    start++;
                    end--;
                    
            }
        return true;
    }
}