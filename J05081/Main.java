package J05081;

import java.util.*;

class MatHang {
  private String ma, ten, donVi;
  private int giaMua, giaBan;

  public MatHang(String ma, String ten, String donVi, int giaMua, int giaBan) {
    this.ma = ma;
    this.ten = ten;
    this.donVi = donVi;
    this.giaMua = giaMua;
    this.giaBan = giaBan;
  }

  public String getMa() {
    return ma;
  }

  public int profit() {
    return this.giaBan - this.giaMua;
  }

  public String toString() {
    return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + profit();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<MatHang> arr = new ArrayList<>();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      String ten = sc.nextLine();
      String donVi = sc.nextLine();
      int giaMua = sc.nextInt();
      int giaBan = sc.nextInt();
      arr.add(new MatHang("MH" + String.format("%03d", i), ten, donVi, giaMua, giaBan));
    }
    Collections.sort(arr, new Comparator<MatHang>() {
      public int compare(MatHang t, MatHang t1) {
        if (t.profit() != t1.profit()) {
          return t1.profit() - t.profit();
        } else {
          return t.getMa().compareTo(t1.getMa());
        }
      }
    });
    for (MatHang x : arr) {
      System.out.println(x);
    }
  }
}
