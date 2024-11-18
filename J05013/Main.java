package J05013;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class TuyenDung {
  private String ma, ten;
  private double lyThuyet, thucHanh;

  public TuyenDung(String ma, String ten, double lyThuyet, double thucHanh) {
    this.ma = ma;
    this.ten = ten;
    this.lyThuyet = lyThuyet;
    this.thucHanh = thucHanh;
  }

  public double diemTB() {
    if (this.lyThuyet > 10) {
      this.lyThuyet /= 10.0;
    }
    if (this.thucHanh > 10) {
      this.thucHanh /= 10.0;
    }
    return (this.lyThuyet + this.thucHanh) / 2.0;
  }

  public String ketQua() {
    if (diemTB() < 5) {
      return "TRUOT";
    } else if (diemTB() >= 5 && diemTB() < 8) {
      return "CAN NHAC";
    } else if (diemTB() >= 8 && diemTB() < 9.5) {
      return "DAT";
    } else {
      return "XUAT SAC";
    }
  }

  public String toString() {
    return ma + " " + ten + " " + String.format("%.2f", diemTB()) + " " + ketQua();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<TuyenDung> arr = new ArrayList<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      String ten = sc.nextLine();
      double lyThuyet = sc.nextDouble();
      double thucHanh = sc.nextDouble();
      TuyenDung s = new TuyenDung("TS" + String.format("%02d", i), ten, lyThuyet, thucHanh);
      arr.add(s);
    }
    Collections.sort(arr, new Comparator<TuyenDung>() {
      public int compare(TuyenDung t, TuyenDung t2) {
        if (t.diemTB() != t2.diemTB()) {
          if (t.diemTB() < t2.diemTB()) {
            return 1;
          } else {
            return -1;
          }
        }
        return 1;
      }
    });
    for (TuyenDung x : arr) {
      System.out.println(x);
    }
  }
}
