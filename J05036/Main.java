package J05036;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<matHang> mh = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      mh.add(
          new matHang("MH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
    }
    for (matHang x : mh) {
      System.out.println(x);
    }
  }
}