package Class;

class z_algo {
 
    //  prints all occurrences of pattern in text using
    // Z algo
    public static void main(String[] args) {
        
        System.out.println(sumScores("babab"));
    }
    public static long sumScores(String s) {
        int size = s.length();
        int[] zArr = getZArray(s);
        long ans = 0;
        for(int i = size+1; i<zArr.length; i++)
            ans +=zArr[i];
        return ans;
    }

    static int[] getZArray(String s){
        int l = 0, r = 0;
        s= s+"$"+s;
        int[] zArr = new int[s.length()];
        for(int i =1; i<s.length(); i++){
            if(i>r){
                l = r = i;
                while(r<s.length() && s.charAt(r) == s.charAt(r-l))
                    r++;
                zArr[i] = r-l;
                r--;
            }
            else{
                int k = i-l;
                if(zArr[k]<r-i+1)
                    zArr[i] = zArr[k];
                else{
                    l = i;
                    while(r<s.length() && s.charAt(r) == s.charAt(r-l))
                        r++;
                    zArr[i] = r-l;
                    r--;
                }
            }
        }
        return zArr;
    }
}
