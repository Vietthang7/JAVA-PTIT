package J05023;

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
    int k = sc.nextInt();
    sc.nextLine();
    while (k-- > 0) {
      String khoa = sc.nextLine();
      System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
      for (SinhVien x : arr) {
        if (x.getLop().substring(1, 3).contentEquals(khoa.substring(2))) {
          System.out.println(x);
        }
      }
    }
  }
}
