package J06003;

import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] x = (sc.nextLine().trim().split("\\s+"));
    int n = Integer.parseInt(x[0]);
    int m = Integer.parseInt(x[1]);
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
      arr.add(tmp);
    }
    HashMap<String, String> mp = new HashMap<>();
    for (int i = 1; i <= m; i++) {
      mp.put(i + "", sc.nextLine());
    }
    int q = Integer.parseInt(sc.nextLine());
    while (q-- > 0) {
      String t = sc.nextLine();
      System.out.println("DANH SACH NHOM " + t + ":");
      for (SinhVien k : arr) {
        if (k.getStt().equals(t)) {
          System.out.println(k);
        }
      }
      System.out.println("Bai tap dang ky: " + mp.get(t));
    }
  }
}
