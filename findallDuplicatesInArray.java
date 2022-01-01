import java.util.ArrayList;

public class findallDuplicatesInArray {
    public static void main(String[] args)throws Exception {
        int[] arr = { 4,3,2,7,8,2,3,1};
        ArrayList<Integer> res=  findDisappearedNumbers(arr);
        display(res);
      
}
   

private static void display(ArrayList<Integer> res) {
    for (int x:res) {
        System.out.println(x);
   }
    }


private static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
    ArrayList<Integer>res=new ArrayList<>();
    int i=0;
    while (i<arr.length) {
        int check=arr[i]-1;
        if (arr[i]!=arr[check]) {
swap(arr, i, check);
            
        } else {
            i++;
        }
       
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1) {
                res.add(arr[index]);
            }
        
    }
    return res;
}


private static void swap(int[] arr, int i, int check) {
    int temp=arr[i];
    arr[i]=arr[check];
    arr[check]=temp;
}
  
}
