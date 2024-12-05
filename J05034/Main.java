package J05034;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> arr = new ArrayList<>();
    int t = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= t; i++) {
      arr.add(new SinhVien("" + i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<SinhVien>() {
      public int compare(SinhVien t, SinhVien t1) {
        return t.getHoTen().compareTo(t1.getHoTen());
      }
    });
    int k = sc.nextInt();
    sc.nextLine();
    while (k-- > 0) {
      String dn = sc.nextLine();
      for (SinhVien x : arr) {
        if (x.getDoanhNghiep().compareTo(dn) == 0) {
          System.out.println(x);
        }
      }
    }
  }

}