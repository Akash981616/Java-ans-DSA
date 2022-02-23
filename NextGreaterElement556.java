class Solution {
    public int nextGreaterElement(int n) {
           
        char arr[]=(n+"").toCharArray();
            int i=arr.length-1;
            
            while(i>0){
                    if(i>=0&&arr[i]>arr[i-1]){
                            break;
                    }
                    i--;
            }
            
            if(i==0)return -1;
            int fistSwap=i-1;//got first element 
            //find  second greater element than firstSwap;
            int secSwap=arr.length-1;;
            while(secSwap>=0){
                    if(arr[secSwap]>arr[fistSwap]){
                            break;
                    }
                    secSwap--;
            }
        //swap both points
            char temp=arr[fistSwap];
                arr[fistSwap]=arr[secSwap];
                arr[secSwap]=temp;
            //reverser whole characters from fistSwap to secSwap
            reverse(arr,fistSwap+1,arr.length-1);
            long val=Long.parseLong(new String(arr));
        ;
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
        public static void reverse(char arr[],int i,int j){
                while(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
                }
                
        }
}