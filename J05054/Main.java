package J05054;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<hocSinh> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      arr.add(new hocSinh("HS" + String.format("%02d", i), sc.nextLine(), sc.nextDouble()));
    }
    Collections.sort(arr, new Comparator<hocSinh>() {
      public int compare(hocSinh t, hocSinh t1) {
        if (t.getDiem() < t1.getDiem()) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    arr.get(0).setXepHang(1);
    for (int i = 1; i < n; i++) {
      if (arr.get(i).getDiem() == arr.get(i - 1).getDiem()) {
        arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
      } else {
        arr.get(i).setXepHang(i + 1);
      }
    }
    Collections.sort(arr, new Comparator<hocSinh>() {
      public int compare(hocSinh t, hocSinh t1) {
        return t.getMa().compareTo(t1.getMa());
      }
    });
    for (hocSinh x : arr) {
      System.out.println(x);
    }
  }
}
