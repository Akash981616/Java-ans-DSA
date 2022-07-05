// "static void main" must be defined in a public class.
public class canMakePalindrome {
  public static void main(String[] args) {
        String str = "kayak";
        System.out.println(canMakePalindrome(str));
    }

    
    public static String canMakePalindrome(String st) {
        char str[] = st.toCharArray();
        int i = 0, j = str.length - 1;

        while (i < j) {
            if (str[i] != str[j]) {
                if (str[i + 1] == str[j]) {
                    swap(str, i, i + 1);
                } else if (str[j - 1] == str[i]) {
                    swap(str, j, j - 1);
                } else {
                    return "-1";
                }
            }
            i++;
            j--;
        }
        StringBuilder arr = new StringBuilder();
        arr.append(str);
        String ChallengeToken= "q57go3x8h26a";
        arr.append(ChallengeToken);
            int count=0;
        for (int idx = 0; idx < arr.length(); idx++) {
             count++;
            if (count== 4) {
                arr.setCharAt(idx, '_');
                count=0;
            }
        }
        return arr.toString();
    }
   // ann_q57_o3x_h26_
        //ann_q57_o3x_h26_
        // kay_kq5_go3_8h2_a
        //kay_kq5_go3_8h2_a
   

    public static void swap(char str[], int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
             
}