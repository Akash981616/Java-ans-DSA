class Solution {
    public int minimumDeviation(int[] nums) {
          TreeSet<Integer>set=new TreeSet<>();
            for(int x:nums){
                    if(x%2==1){
                            set.add(x*2);
                    }else set.add(x);
            }
            for(int v:set){
System.out.println(v);}
            int deviation=Integer.MAX_VALUE;
            while(true){
                    int max=set.last();
                    deviation=Math.min(deviation,max-set.first());
                    if(max%2==1){
                            break;
                    }else{
                       set.remove(max);
                            set.add(max/2);
                    }
            }
            return deviation;
    }
}