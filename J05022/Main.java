package J05022;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String x = sc.nextLine();
      System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
      for (SinhVien sv : arr) {
        if (sv.getLop().compareTo(x) == 0) {
          System.out.println(sv);
        }
      }
    }
  }
}
