

/**
 * FindTheJudge
 */
public class FindTheJudge {
public static void main(String[] args) {
   
    int [][] trust= {{1,3},{2,3}};
    int n=3;
    
            int count[] = new int[n+1];
            
            for(int t[] : trust){
                System.out.println(count[t[1]]++);
                count[t[0]]--;     // outdegree
                count[t[1]]++;   // indegree
            }
            
            for(int i=1;i<=n;i++){
                if(count[i]==n-1);

            }
            
            
            
        }
    }