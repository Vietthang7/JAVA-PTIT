package J05044;

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
      String chucVu = sc.next();
      for (NhanVien x : arr) {
        if (x.getChucVu().compareTo(chucVu) == 0) {
          System.out.println(x);
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
