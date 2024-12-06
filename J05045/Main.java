package J05045;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      ArrayList<NhanVien> arr = new ArrayList<>();
      int t = sc.nextInt();
      for (int i = 1; i <= t; i++) {
        sc.nextLine();
        arr.add(
            new NhanVien("NV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
      }
      Collections.sort(arr, new Comparator<NhanVien>() {
        public int compare(NhanVien t, NhanVien t1) {
          if (t.tongLuong() != t1.tongLuong()) {
            return t1.tongLuong() - t.tongLuong();
          }
          return t.getMa().compareTo(t1.getMa());
        }
      });
      for (NhanVien x : arr) {
        System.out.println(x);
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
