import java.util.*;

public class J03008 {
  public static String solve(String s) {
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (c != '2' && c != '3' && c != '5' && c != '7') {
        return "NO";
      }
    }
    String rev = new StringBuilder(s).reverse().toString();
      if(s.equals(rev)){
        return "YES";
      }
      return "NO";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      System.out.println(solve(s));
    }
  }
}
