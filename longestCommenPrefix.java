class Solution {
    public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)return"";
            String pre=strs[0];
            int min=Integer.MAX_VALUE;
            for(String s:strs){
                    int i=0;
                    while(i<s.length()&&i<pre.length()&&s.charAt(i)==pre.charAt(i)){
                            i++;
                    }
                    min=Math.min(min,i);
            }
        return pre.substring(0,min);
    }
}