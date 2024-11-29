package J04018;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
      SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
      SoPhuc c = (a.add(b)).mul(a);
      SoPhuc d = (a.add(b)).mul(a.add(b));
      System.out.println(c + ", " + d);
    }
  }
}
