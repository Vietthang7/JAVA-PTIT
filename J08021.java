import java.util.*;

public class J08021 {
  public static int find(String s) {
    int maxLength = 0;
    int open = 0;
    int close = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        ++open;
      } else if (s.charAt(i) == ')') {
        ++close;
      }
      if (open == close) {
        maxLength = Math.max(open * 2, maxLength);
      } else if (close > open) {
        open = 0;
        close = 0;
      }
    }
    open = 0;
    close = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ')') {
        close++;
      } else if (s.charAt(i) == '(') {
        open++;
      }
      if (open == close) {
        maxLength = Math.max(maxLength, 2 * close);
      } else if (open > close) {
        open = 0;
        close = 0;
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    while (t-- > 0) {
      String s = sc.nextLine();
      System.out.println(find(s));
    }
  }
}
