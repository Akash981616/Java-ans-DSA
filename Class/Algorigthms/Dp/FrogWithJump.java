import java.util.HashMap;
import java.util.HashSet;

public class FrogWithJump {
    /**
     * @param stones
     * @return
     */
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], new HashSet<>());
        }
        map.get(stones[0]).add(1);
        for (int ele : stones) {
            for (int jumps : map.get(ele)) {
                int pos = jumps + ele;
                if (pos == stones[stones.length - 1])
                    return true;
                if (jumps != 0 && map.containsKey(pos)) {
                    map.get(pos).add(jumps - 1);
                    map.get(pos).add(jumps);
                    map.get(pos).add(jumps + 1);
                }
            }
        }
      
        return false;
    }
}
    



