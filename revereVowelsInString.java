class Solution {
    public String reverseVowels(String s) {
            if(s.length()<=1)return s;
           char []st=s.toCharArray();
        int first=0;
        int second=s.length()-1;
            while(first<second){
                    while(first<second&&isVowel(st,first)==false){
                            first++;
                    }
                     while(first<second&&isVowel(st,second)==false){
                            second--;
                    }
                     swap(st,first,second);
                    first++;
                    second--;
            }
        
            return new String(st);
    }
         public static void swap(char[] st, int a, int b) {
             char temp = st[a];
             st[a] = st[b];
             st[b] = temp;
         }
        public static boolean isVowel(char st[],int pointer ){
                char ch=st[pointer];
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                        return true;
                }
             return false;   
        }
}