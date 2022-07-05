import java.util.Scanner;

public class CypherTextcoderByte {
  //   Have the function StringChallenge(str, num) take the str parameter and perform a Caesar Cipher shift on it using the num parameter as the shifting number. A Caesar Cipher works by shifting each letter in the string N places in the alphabet (in this case N will be num). Punctuation, spaces, and capitalization should remain intact. For example, if the string is "Caesar Cipher" and the num is 2 the output should be "Ecguct Ekrjgt".
  // Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every fourth character with an underscore.
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = "abc";
    int key = 0;
    String token = "q57go3x8h26a";
    System.out.println(getCiper(str, key, token));
  }

  private static String getCiper(String str, int key, String token) {
    String ans = " ";
    for (char c : str.toCharArray()) {
      int curr = c - 'a' + key;
      ans += (char) (curr + 'a');
    }
    ans += token;
    StringBuilder arr = new StringBuilder();
    arr.append(ans);
    for (int i = 0; i < arr.length(); i++) {
      if (i == 0)
        continue;
      if (i % 4 == 0) {
        arr.setCharAt(i, '_');
      }
    }
    if (key == 0)
      return " ";
    return arr.toString();
  }
}
 

