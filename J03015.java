import java.math.BigInteger;
import java.util.*;

public class J03015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger m = sc.nextBigInteger();
    BigInteger n = sc.nextBigInteger();
    // System.out.println(m + " " + n);
    BigInteger k = m.subtract(n);
    System.out.println(k);
  }
}
