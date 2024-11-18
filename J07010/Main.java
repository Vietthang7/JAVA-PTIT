
package J07010;

import java.util.*;
import java.io.*;

class SinhVien {
  private String ma, ten, lop, ngaySinh;
  double gpa;

  public SinhVien(String ma, String ten, String lop, String ngaySinh, double gpa) {
    this.ma = ma;
    this.ten = ten;
    this.lop = lop;
    this.ngaySinh = ngaySinh;
    this.gpa = gpa;
  }

  public void chuanHoa() {
    String[] a = ten.trim().split("\\s+");
    String name = "";
    for (String x : a) {
      name += Character.toUpperCase(x.charAt(0));
      for (int i = 1; i < x.length(); i++) {
        name += Character.toLowerCase(x.charAt(i));
      }
      name += " ";
    }
    this.ten = name.trim();
    StringBuilder sb = new StringBuilder(ngaySinh);
    if (sb.charAt(1) == '/') {
      sb.insert(0, "0");
    }
    if (sb.charAt(4) == '/') {
      sb.insert(3, "0");
    }
    this.ngaySinh = sb.toString();
  }

  public String toString() {
    chuanHoa();
    return this.ma + " " + this.ten + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", gpa);
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("SV.in"));
    int n = Integer.parseInt(sc.nextLine()); // Không cần thay đổi gì ở đây
    for (int i = 1; i <= n; i++) {
      String ten = sc.nextLine();
      String lop = sc.nextLine();
      String ngaySinh = sc.nextLine();
      double gpa = Double.parseDouble(sc.nextLine()); // Chỉnh sửa ở đây để đọc đúng kiểu double
      SinhVien s = new SinhVien("B20DCCN" + String.format("%03d", i), ten, lop, ngaySinh, gpa);
      System.out.println(s);
    }
    sc.close(); // Đừng quên đóng Scanner
  }
}
