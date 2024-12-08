package J05052;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<donHang> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new donHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
    }
    for (donHang x : arr) {
      System.out.println(x);
    }
  }
}
