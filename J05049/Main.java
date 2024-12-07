package J05049;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<matHang> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new matHang(sc.nextLine(), sc.nextInt()));
    }
    Collections.sort(arr, new Comparator<matHang>() {
      public int compare(matHang t, matHang t1) {
        if (t.Thue() <= t1.Thue()) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    String mak = sc.next();
    for (matHang x : arr) {
      if (x.getMa().contentEquals(mak)) {
        System.out.println(x);
      }
    }
  }
}
