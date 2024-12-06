package J05037;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<matHang> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      arr.add(new matHang("MH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr, new Comparator<matHang>() {
      public int compare(matHang t, matHang t1) {
        return t1.giaBan() - t.giaBan();
      }
    });
    for (matHang x : arr) {
      System.out.println(x);
    }
  }
}