package J05021;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> arr = new ArrayList<>();
    while (sc.hasNextLine()) {
      arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<SinhVien>() {
      public int compare(SinhVien t, SinhVien t1) {
        return t.getMa().compareTo(t1.getMa());
      }
    });
    for (SinhVien x : arr) {
      System.out.println(x);
    }
  }
}
