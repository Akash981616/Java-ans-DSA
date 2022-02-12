import java.util.*;
import java.io.*;
class Solution {
    // https://leetcode.com/problems/word-ladder/
    
    public int ladderLength(String start, String end, List<String> list) {
            if(!list.contains(end)) return 0;
            int level=0;
            HashSet<String>map=new HashSet<>(list);
            Queue <String> q=new LinkedList<>();
            q.add(start);
            while(q.size()>0){
                    int size=q.size();
                    for(int i=0;i<size;i++){
                    String s=q.poll();
                    if(s.equals(end)) return level+1;
                   wordMatch(s,q,map);
                    }
                    level++;
            }
            return 0;
    }
        public static void wordMatch(String s,Queue<String>q,HashSet<String>map){
                for(int i=0;i<s.length();i++){
                        char word[]=s.toCharArray();
                        for( char j='a';j<='z';j++){
                                word[i]=j;
                                String check=new String(word);
                                if(map.contains(check)){
                                   map.remove(check);
                                        q.add(check);
                                }
                        }
                }        
        }
}