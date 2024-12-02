package J05020;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<SinhVien>() {
      public int compare(SinhVien t, SinhVien t1) {
        if (t.getLop().compareTo(t1.getLop()) != 0) {
          return t.getLop().compareTo(t1.getLop());
        } else {
          return t.getMa().compareTo(t1.getMa());
        }
      }
    });
    for (SinhVien x : arr) {
      System.out.println(x);
    }
  }
}
