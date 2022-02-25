class Solution {
    static  List<Integer>res=new ArrayList<>();
public List<Integer> lexicalOrder(int n) {
   
        for(int i=1;i<=9;i++){
           getNumbers(i,n);
        }
       return res;
}
    public static  void getNumbers(int i,int n){
            if(i>n)return;
            res.add(i);
            for(int j=0;j<=9;j++){
                    getNumbers(10*i+j,n);
                    
            }
    }
}