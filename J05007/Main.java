package J05007;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> arr = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= n; i++) {
      arr.add(new NhanVien(String.format("%05d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
          sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<NhanVien>() {
      public int compare(NhanVien t, NhanVien t2) {
        return t.getTuoi().compareTo(t2.getTuoi());
      }
    });
    for (NhanVien x : arr) {
      System.out.println(x);
    }
  }
}
