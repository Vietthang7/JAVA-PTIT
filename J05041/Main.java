package J05041;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new NhanVien("NV" + String.format("%02d", i), sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
    }
    Collections.sort(arr, new Comparator<NhanVien>() {
      public int compare(NhanVien t, NhanVien t1) {
        return t1.tongLuong() - t.tongLuong();
      }
    });
    for (NhanVien x : arr) {
      System.out.println(x);
    }
  }
}