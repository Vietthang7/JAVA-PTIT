package J05048;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<matHang> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new matHang(sc.nextLine(), sc.nextLong()));
    }
    for (matHang x : arr) {
      System.out.println(x);
    }

  }
}