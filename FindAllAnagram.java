import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            
        ArrayList <Integer>ans=new ArrayList<>();
            if(s.isEmpty() || p.length()>s.length()) return ans;
           HashMap<Character,Integer>sm=new HashMap<>();
    HashMap<Character,Integer>pm=new HashMap<>();
    for(int i=0;i<p.length();i++){
        char c=p.charAt(i);
        pm.put(c,pm.getOrDefault(c,0)+1);
    }
    for(int i=0;i<p.length();i++){
        char c=s.charAt(i);
        sm.put(c,sm.getOrDefault(c,0)+1);
    }
 
    int i=p.length();
    int j=0;
    int count=0;
    while(i<s.length()){
        if(isAnagram(pm,sm)==true){
            count++;
         ans.add(i-p.length());
        }
       char cha=s.charAt(i);
       sm.put(cha,sm.getOrDefault(cha,0)+1);
       char chr=s.charAt(i-p.length());
       if(sm.get(chr)==1){
           sm.remove(chr);
       }else{
           sm.put(chr,sm.get(chr)-1);
       }
       i++;
       j++;
    }
    if(isAnagram(pm,sm)==true){
            count++;
         ans.add(i-p.length());
        }
            return ans;
  }
  public static boolean isAnagram(HashMap<Character,Integer>pm,HashMap<Character,Integer>sm){
      for(char ch:sm.keySet()){
        if(sm.getOrDefault(ch,0)!=pm.get(ch)){
            return false;
        }
        
      }
      return true;
  }
  
}