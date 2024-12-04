package J05024;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> arr = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String nganh = sc.nextLine().toUpperCase();
      System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
      for (SinhVien x : arr) {
        if (x.getNganh().equalsIgnoreCase(nganh)) {
          System.out.println(x);
        }
      }
    }
  }
}
