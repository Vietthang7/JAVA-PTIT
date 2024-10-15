package J04005;

import java.util.*;

class ThiSinh {
  private String ten, ngaySinh;
  private double d1, d2, d3;

  public ThiSinh(String ten, String ngaySinh, double d1, double d2, double d3) {
    this.ten = ten;
    this.ngaySinh = ngaySinh;
    this.d1 = d1;
    this.d2 = d2;
    this.d3 = d3;
  }

  public void inThongTin() {
    System.out.println(ten + " " + ngaySinh + " " + String.format("%.1f", d1 + d2 + d3));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ThiSinh s = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    s.inThongTin();
  }
}
