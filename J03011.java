import java.math.BigInteger;
import java.util.*;

public class J03011 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      BigInteger m = sc.nextBigInteger();
      BigInteger n = sc.nextBigInteger();
      System.out.println(m.gcd(n));
    }
  }
}
