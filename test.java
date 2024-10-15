import java.util.*;

public class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for (int i = 0; i <= s.length(); i++) {
      int t = (s.charAt(i)-'0');
      System.out.println(t);
    }
  }
}
