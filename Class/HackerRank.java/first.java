package HackerRank.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;

class first {
    public static void main(String[] args) {
        Arrays.sort();
        LinkedList<Integer> ans = new LinkedList<>();
         List<Integer> result = new ArrayList<>();
          List<Integer> ranked = new ArrayList<>();
    result.add(100);
    result.add(50);
    result.add(40);
    result.add(40);
    result.add(20);
    result.add(10);
    ranked.add(5);
    ranked.add(24);
    ranked.add(50);
    ranked.add(120);
    climbingLeaderboard(result, ranked);
    // for (int ele : res) {
    //     System.out.println(ele);
    // }. 
}
    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */
     
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a, Pair b) -> {
            if (a.ranked == b.ranked) {
                return a.player - b.player;
            } else {
                return a.player - b.player;
            }
        });
        for (int i = 0; i < player.size(); i++) {
            pq.add(new Pair(i, ranked.get(i), player.get(i)));
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            Pair rem = pq.poll();
            System.out.println(rem.idx+" "+rem.player+" "+rem.ranked);
            res.add(rem.idx);            
        }
        return res;
    }
    

    public static class Pair {
        int idx;
        int ranked;
        int player;

        Pair(int idx, int ranked, int player) {
            this.idx = idx;
            this.ranked = ranked;
            this.player = player;

        }
    }

}
