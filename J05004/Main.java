package J05004;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      String ten = sc.nextLine();
      String lop = sc.nextLine();
      String ngaySinh = sc.nextLine();
      Double gpa = sc.nextDouble();
      SinhVien s = new SinhVien("B20DCCN" + String.format("%03d", i), ten, lop, ngaySinh, gpa);
      System.out.println(s);
    }
  }
}
