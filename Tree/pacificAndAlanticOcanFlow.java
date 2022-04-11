package Tree;

import java.util.*;
class Solution {
        int n;
        int m;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
             n=heights.length;
             m=heights[0].length;
            
            boolean Pacific[][]=new boolean [n][m];
            boolean Atlantic[][]=new boolean[n][m];
            
           int dirs[][]={{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
            for(int i=0;i<n;i++){
                    dfs(heights,Pacific,i,0,dirs);
                     dfs(heights,Atlantic,i,m-1,dirs);
                    
            }
            for(int i=0;i<m;i++){
                   dfs(heights,Pacific,0,i,dirs);
                   dfs(heights,Atlantic,n-1, i,dirs); 
            }
            
            
            List<List<Integer>> res=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                            if(Pacific[i][j]&&Atlantic[i][j])res.add(Arrays.asList(i,j));
                    }
            }
            
            return res;
    }
        public void dfs(int [][]matrix,boolean ocean[][],int i,int j,int dirs[][]){
                  ocean[i][j]=true;
                for(int dir[]:dirs){
                        int newRow =i+dir[0];
                        int newCol=j+dir[1];
                         if(newRow<0 || newRow>= n || newCol<0||newCol>=m || ocean[newRow][newCol] ||                                        matrix[newRow][newCol]<matrix [i][j])continue;
                         dfs(matrix,ocean,newRow,newCol,dirs);

                }
        }
}
static String str1 = "send", str2 = "more", str3 = "money";
    static boolean[] isNumUsed = new boolean[10];
    
    public static void crypto() {
        String str = str1 + str2 + str3;
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        str = "";
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                str += (char) (i + 'a');
        }

        if (str.length() > 10)
            return;
    }

    public static int crypto(String str, int idx,HashMap<Character> h1) {
        if (idx == str.length()) {
            if (valid(h1) == true) {
                return 1;
            }

            return 0;
        }

        int count = 0;
        for (int num = 0; num <= 9; num++) {
            if (!isNumUsed[num]) {
                isNumUsed[num] = true;
                if(h1.containsKey(str.charAt(idx)) == false){
                 h1.put(str.charAt(idx),num);
                }
                count += crypto(str, idx + 1);

                isNumUsed[num] = false;

                if(h1.containsKey(str.charAt(idx)) == true){
                 h1.remove(str.charAt(idx));
                }                
            }

        }

        return count;
    }

    private static boolean valid(HashMap<Character> h1){
      int val1 = 0;
      int power = 1;
      for(int i = 0;i<str1.length;i++){
        if(h1.conatainsKey(str1.charAt(i)) == true){
          int k = h1.get(str1.charAt(i));
          val1 = val1*Math.pow(10,power-1)+k;
          power++;
        }
      }

      int val2 = 0;
      int powe1 = 1;
      for(int i = 0;i<str2.length;i++){
        if(h1.conatainsKey(str2.charAt(i)) == true){
          int k = h1.get(str2.charAt(i));
          val2 = val2*Math.pow(10,powe1-1)+k;
          powe1++;
        }
      }


      int val3 = 0;
      int power3 = 1;
      for(int i = 0;i<str3.length;i++){
        if(h1.conatainsKey(str3.charAt(i)) == true){
          int k = h1.get(str3.charAt(i));
          val3 = val3*Math.pow(10,power3-1)+k;
          power3++;
        }
      }

      if(val1+val2 == val3){
        return true;
      }else{
        return false;
      }
    }