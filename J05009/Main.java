package J05009;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ThuKhoa> arr = new ArrayList<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      arr.add(new ThuKhoa(String.format("%1d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(),
          sc.nextDouble()));
    }
    double res = 0.0;
    for (ThuKhoa x : arr) {
      res = Math.max(res, x.tongDiem());
    }
    for (ThuKhoa x : arr) {
      if (x.tongDiem() == res) {
        System.out.println(x);
      }
    }
  }
}
