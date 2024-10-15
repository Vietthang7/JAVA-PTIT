package J07058;

import java.util.*;
import java.io.*;

class MonHoc {
  private String ma, ten, hinhThuc;

  public MonHoc(String ma, String ten, String hinhThuc) {
    this.ma = ma;
    this.ten = ten;
    this.hinhThuc = hinhThuc;
  }

  public String toString() {
    return ma + " " + ten + " " + hinhThuc;
  }

  public String getMa() {
    return ma;
  }

  public void setMa(String ma) {
    this.ma = ma;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getHinhThuc() {
    return hinhThuc;
  }

  public void setHinhThuc(String hinhThuc) {
    this.hinhThuc = hinhThuc;
  }

}

public class Main {
  public static void main(String[] args) throws Exception {
    List<MonHoc> monHocs = new ArrayList<>();

    Scanner sc = new Scanner(new File("MONHOC.in"));
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      String ma = sc.nextLine().trim();
      String ten = sc.nextLine().trim();
      String hinhThuc = sc.nextLine().trim();
      monHocs.add(new MonHoc(ma, ten, hinhThuc));
    }
    Collections.sort(monHocs, new Comparator<MonHoc>() {
      public int compare(MonHoc t, MonHoc t1) {
        return t.getMa().compareTo(t1.getMa());
      }
    });
    for (MonHoc x : monHocs) {
      System.out.println(x);
    }
  }
}
