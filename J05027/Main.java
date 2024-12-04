package J05027;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiangVien> arr = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= n; i++) {
      arr.add(new GiangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine()));
    }
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String keyword = sc.nextLine();
      System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + keyword + ":");
      keyword = keyword.toLowerCase();
      for (GiangVien x : arr) {
        String res = x.getTen().toLowerCase();
        String[] a = res.split("\\s+");
        for (String k : a) {
          if (k.contains(keyword)) {
            System.out.println(x);
            break;
          }
        }
        // continue;
      }
    }
  }
}
