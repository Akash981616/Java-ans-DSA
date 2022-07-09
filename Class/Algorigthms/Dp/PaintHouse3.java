import java.util.Arrays;

import javax.swing.text.html.parser.TagElement;

public class PaintHouse3 {
class Solution {
    private Integer[][][] cache = new Integer[101][21][101]; // memorization
    private int MAX = (int)1e8;
    private int m, n;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.m = m;
        this.n = n;
        int res = dfs(houses, cost, 0, 0, target);
        return res >= MAX ? -1 : res;
    }
    
    private int dfs(int[] houses, int[][] cost, int houseIdx, int prevColor, int target) {
        // you can't use target <= 0 since when target equals 0, houseIdx may not be m
        if (houseIdx == m || target < 0) 
            return target == 0 ? 0 : MAX;
        
        if (cache[houseIdx][prevColor][target] != null)
            return cache[houseIdx][prevColor][target];
        
        if (houses[houseIdx] != 0) { // already painted
            int curColor = houses[houseIdx];
            // don't need to add cost of paint
            cache[houseIdx][prevColor][target] = dfs(houses, cost, houseIdx + 1, curColor, target - (prevColor == curColor ? 0 : 1)); 
            return cache[houseIdx][prevColor][target];
        }
        
        int res = MAX;
        // try every color and find the minimum cost
        for (int curColor = 1; curColor <= n; curColor++) {
            // need to add cost of paint
            res = Math.min(res, dfs(houses, cost, houseIdx + 1, curColor, target - (prevColor == curColor ? 0 : 1)) + cost[houseIdx][curColor - 1]);
        }
        cache[houseIdx][prevColor][target] = res;
        return res;
    }
}
}



