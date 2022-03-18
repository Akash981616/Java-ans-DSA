class Solution {
    public String removeDuplicateLetters(String s) {
            int n=s.length();
        int map[]=new int[26];
            Stack<Character>stack=new Stack<>();
            boolean seen[]=new boolean[26];
            for(char c:s.toCharArray()){
                    map[c-'a']++;
            }
            for(int i=0;i<n;i++){
                    char ch=s.charAt(i);
                    map[ch-'a']--;
                    if(seen[ch-'a'])continue;
                    seen[ch-'a']=true;
                    while(!stack.isEmpty()&&stack.peek()>ch&&map[stack.peek()-'a']>0){
                            char c=stack.pop();
                             seen[c-'a']=false;
                    }
                    stack.push(ch);
            }
            StringBuilder ans=new StringBuilder();
            for(char c:stack){
                    ans.append(c);
            }
            return ans.toString();
    }
}