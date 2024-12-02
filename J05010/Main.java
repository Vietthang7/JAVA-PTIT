package J05010;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<MatHang> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      arr.add(new MatHang(String.format("%1d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(arr, new Comparator<MatHang>() {
      public int compare(MatHang t, MatHang t1) {
        if (t.getLoiNhuan() < t1.getLoiNhuan()) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    for (MatHang x : arr) {
      System.out.println(x);
    }
  }
}
