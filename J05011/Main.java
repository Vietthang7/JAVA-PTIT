package J05011;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<TinhGio> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(new TinhGio(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<TinhGio>() {
      public int compare(TinhGio t, TinhGio t1) {
        if (t.soPhut() < t1.soPhut()) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    for (TinhGio x : arr) {
      System.out.println(x);
    }
  }
}
