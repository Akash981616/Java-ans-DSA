class Solution {
    public String reorganizeString(String s) {
          class Pair{
        char ch;
        int freq;
        
        Pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
            int charFreq []=new int[26];
            for(char c:s.toCharArray()){
                    charFreq[c-'a']++;
            }
            PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->(b.freq-a.freq));
                for(int i=0;i<26;i++){
                        if(charFreq[i]>0)
                        pq.add(new Pair((char)(i+'a'),charFreq[i]));
                }
             
        Pair block = pq.remove();
        block.freq -= 1;
        StringBuilder sb = new StringBuilder();
        sb.append(block.ch);
        
        while(pq.size() > 0) {
        	Pair temp = pq.remove();
        	sb.append(temp.ch);
        	if(block.freq > 0)
        		pq.add(block);
        	block = temp;
        	block.freq -= 1;
        }
            if(block.freq > 0)
        	return "";
                                                     
         return sb.toString();
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
           for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
            
             PriorityQueue<Character> qq=new PriorityQueue((n1,n2) -> map.get(n2)-map.get(n1));
        qq.addAll(map.keySet()); // adding all characters to heap
        StringBuilder sb=new StringBuilder(); // create a new string
      while(qq.size()>1){
          char c1=qq.remove(); // remove the most frequent element
          char c2=qq.remove(); // remove the 2nd most frequent element
          sb.append(c1); // add to string
          sb.append(c2);
          map.put(c1,map.get(c1)-1); // decrease their values in the map
          map.put(c2,map.get(c2)-1);
          if(map.get(c1)>0) // if the frequency of the element is >0 then add it back in the heap
              qq.add(c1);
          if(map.get(c2)>0)
              qq.add(c2);
      }
            if(!qq.isEmpty()){ // if queue is not empty 
            char w=qq.remove();
            if(map.get(w)>1) //if the frequency of character is >1 then the string can't be arranged 
                return ""; // so return empty string
                sb.append(w); // otherwise add it to the string
        }
            return sb.toString();
    }
}