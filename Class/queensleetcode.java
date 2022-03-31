package Class;

//Leetcode 51 N Queens  2
class Solution {
    public int totalNQueens(int n) {
            if(n==0)return 0;
            
        return getCount(new boolean[n][n],0,0,n);
        
    }
        private int getCount(boolean[][]boxes,int qsf,int boxno,int total){
                if(qsf==total){
                        return 1;
                }
                
                int count=0;
                for(int i=boxno;i<total*total;i++){
                        int r=i/total;
                        int c=i%total;
                        if(isSafe(boxes,r,c)){
                        boxes[r][c]=true;
                        count+=getCount(boxes,qsf+1,i+1,total);
                        boxes[r][c]=false;
                        }
                        
                }
                return count ;
        }
        private boolean isSafe(boolean[][]boxes,int r,int c){
                int dir[][]={ { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
                for(int dirs[]:dir){
                        for(int rad=0;rad<boxes.length;rad++){
                                int x=r+rad*dirs[0];
                                int y=c+rad*dirs[1];
                                if(x>=0 && y>=0 && x<boxes.length && y<boxes[0].length){
                                        if(boxes[x][y]==true){
                                                return false;
                                        }
                                }
                        }
                }
                return true;
        }
}
//Leetcode 51 N Queens 1
class Solution {
    public List<List<String>> solveNQueens(int n) {
          List<List<String>>res=new ArrayList<>();
           if(n==0)return res;
            char boxes[][]=new char[n][n];
        for (char[] row : boxes) Arrays.fill(row, '.');
         getCount(boxes,0,0,n,res);
            return res;
        
    }
        private void getCount(char[][]boxes,int qsf,int boxno,int total,List<List<String>>res){
                if(qsf==total){
                        List<String>curr=new ArrayList<>();
                    for(char c[]:boxes)curr.add(String.valueOf(c));
                        res.add(curr);
                        return ;
                }
                
                for(int i=boxno;i<total*total;i++){
                        int r=i/total;
                        int c=i%total;
                        if(isSafe(boxes,r,c)){
                         boxes[r][c]='Q';
                          getCount(boxes,qsf+1,i+1,total,res);
                        boxes[r][c]='.';
                        }
                        
                }
               return;
        }
        private boolean isSafe(char[][]boxes,int r,int c){
              int dir[][]={ { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
                 //int[][] dir = { { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 },  { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
                for(int dirs[]:dir){
                        for(int rad=0;rad<boxes.length;rad++){
                                int x=r+rad*dirs[0];
                                int y=c+rad*dirs[1];
                                if(x>=0 && y>=0 && x<boxes.length && y<boxes[0].length){
                                        if(boxes[x][y]=='Q'){
                                                return false;
                                        }
                                }
                        }
                }
                return true;
        }
}
