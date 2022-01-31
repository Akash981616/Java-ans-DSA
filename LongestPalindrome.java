import java.util.HashSet;

public class LongestPalindrome {
public static int main(String[] args) {
    String s="abccccdd";
    HashSet<Character>hs=new HashSet<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isLowerCase(c)){
        
        if(hs.contains(c)){
            hs.remove(c);
        }else{
            hs.add(c);
        }}
    }
    int size=s.length()-hs.size();
     if(hs.size()!=0) return size+1;
    return size;
} 
}
