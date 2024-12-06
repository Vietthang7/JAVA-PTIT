package J05043;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new NhanVien("NV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
    }
    for (NhanVien x : arr) {
      System.out.println(x);
    }
  }
}
