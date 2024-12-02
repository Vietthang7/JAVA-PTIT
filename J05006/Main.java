package J05006;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> arr = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      arr.add(new NhanVien(String.format("%05d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
          sc.nextLine(), sc.nextLine()));
    }
    for (NhanVien x : arr) {
      System.out.println(x);
    }

  }
}