package J05012;

import java.util.*;

class SanPham {
  private String ma, ten;
  long soLuong, donGia, chietKhau;

  public SanPham(String ma, String ten, long soLuong, long donGia, long chietKhau) {
    this.ma = ma;
    this.ten = ten;
    this.soLuong = soLuong;
    this.donGia = donGia;
    this.chietKhau = chietKhau;
  }

  public long tongTien() {
    return this.soLuong * this.donGia;
  }

  public long tongTienFinal() {
    return tongTien() - this.chietKhau;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.soLuong + " " + this.donGia + " " + this.chietKhau + " " + tongTienFinal();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<SanPham> arr = new ArrayList<>();
    int t = sc.nextInt();
    while (t-- > 0) {
      sc.nextLine();
      String ma = sc.nextLine();
      String ten = sc.nextLine();
      long soLuong = sc.nextLong();
      long donGia = sc.nextLong();
      long chietKhau = sc.nextLong();
      SanPham s = new SanPham(ma, ten, soLuong, donGia, chietKhau);
      arr.add(s);
    }
    Collections.sort(arr, new Comparator<SanPham>() {
      public int compare(SanPham t, SanPham t1) {
        if (t.tongTienFinal() != t1.tongTienFinal()) {
          if (t.tongTienFinal() < t1.tongTienFinal()) {
            return 1;
          } else {
            return -1;
          }
        }
        return 1;
      }
    });
    for (SanPham x : arr) {
      System.out.println(x);
    }
  }
}
