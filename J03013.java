import java.math.BigInteger;
import java.util.*;

public class J03013 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      BigInteger m = sc.nextBigInteger();
      BigInteger n = sc.nextBigInteger();
      BigInteger result = m.subtract(n).abs();
      int lengthM = m.toString().length();
      int lengthN = n.toString().length();
      String resultFinal = result.toString();
      int max = Math.max(lengthM, lengthN);
      while (resultFinal.length() < max) {
        resultFinal = "0" + resultFinal;
      }
      System.out.println(resultFinal);
    }
  }
}
