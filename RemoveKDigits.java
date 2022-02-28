class Solution {
    public String removeKdigits(String num, int k) {
       Stack <Character>stack=new Stack<>();
            
            for(char c:num.toCharArray()){
                    while(!stack.isEmpty()&&k>0&&stack.peek()>c){
                            stack.pop();
                            k--;    
                    }
                    stack.push(c);
            }
            while(!stack.isEmpty()&&k>0){
                    k--;
            stack.pop();    
           }
            StringBuilder ans=new StringBuilder();
            while(!stack.isEmpty()){
            ans.append(stack.pop());    
            }
            ans.reverse();
            while(ans.length()>1&&ans.charAt(0)=='0'){
            ans.deleteCharAt(0);    
            }
            return ans.length() > 0 ? ans.toString() : "0";
    }
}