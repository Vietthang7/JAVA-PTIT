package J05042;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      sc.nextLine();
      arr.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr, new Comparator<SinhVien>() {
      public int compare(SinhVien t, SinhVien t1) {
        if (t.getAccepted() != t1.getAccepted()) {
          return t1.getAccepted() - t.getAccepted();
        } else {
          if (t.getSubmit() != t1.getSubmit()) {
            return t.getSubmit() - t1.getSubmit();
          } else {
            return t.getTen().compareTo(t1.getTen());
          }
        }
      }
    });
    for (SinhVien x : arr) {
      System.out.println(x);
    }
  }
}
