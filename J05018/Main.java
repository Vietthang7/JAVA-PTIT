package J05018;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<BangDiem> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sc.nextLine();
      arr.add(
          new BangDiem("HS" + String.format("%02d", i), sc.nextLine(), sc.nextDouble(), sc.nextDouble(),
              sc.nextDouble(), sc.nextDouble(),
              sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(arr, new Comparator<BangDiem>() {
      public int compare(BangDiem t, BangDiem t1) {
        if (t.diemTB() != t1.diemTB()) {
          if (t.diemTB() < t1.diemTB()) {
            return 1;
          } else {
            return -1;
          }
        } else {
          return t.getMa().compareTo(t1.getMa());
        }
      }
    });
    for (BangDiem x : arr) {
      System.out.println(x);
    }
  }
}
