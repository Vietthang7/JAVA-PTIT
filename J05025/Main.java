package J05025;

import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiangVien> arr = new ArrayList<>();
    int t = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= t; i++) {
      arr.add(new GiangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine()));
    }
    Collections.sort(arr, new Comparator<GiangVien>() {
      public int compare(GiangVien t, GiangVien t1) {
        if (t.getTen().compareTo(t1.getTen()) != 0) {
          if (t.getTen().compareTo(t1.getTen()) < 0) {
            return -1;
          } else {
            return 1;
          }
        } else {
          return t.getMa().compareTo(t1.getMa());
        }
      }
    });
    for (GiangVien x : arr) {
      System.out.println(x);
    }
  }
}
