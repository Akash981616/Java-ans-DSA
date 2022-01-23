 class Solution {
    public boolean validPalindrome(String s) {
          int i=0;
            int j=s.length()-1;
            while(i<j){
                    char c1=s.charAt(i);
                    char c2=s.charAt(j);
                    if(c1!=c2){
                            return ispalidrome(s,i+1,j)||ispalidrome(s,i,j-1);
                                                                       
                            
                    }else{
                   i++;
                    j--;
                    }
                    
            }
        return true;
    }
        static boolean ispalidrome(String s,int start,int end){
               while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                        return false;
                }
               start++;
               end--;}
                return true;
} 
}
