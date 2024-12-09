package J06005;

import java.util.ArrayList;

public class HoaDon {
  private String maHD, maKH, maMH, tenKH, diaChi, tenMH, donVi;
  private long giaMua, giaBan, soLuong, thanhTien;
  ArrayList<KhachHang> x = new ArrayList<>();
  ArrayList<MatHang> y = new ArrayList<>();

  public HoaDon(String maHD, String maKH, String maMH, long soLuong, ArrayList<KhachHang> x, ArrayList<MatHang> y) {
    this.maHD = maHD;
    this.maKH = maKH;
    this.maMH = maMH;
    this.soLuong = soLuong;
    this.x = x;
    this.y = y;
    Khach();
    Hang();
  }

  public void Khach() {
    for (KhachHang h : x) {
      if (h.getMaKH().compareTo(this.maKH) == 0) {
        this.tenKH = h.getTenKH();
        this.diaChi = h.getDiaChi();
        return;
      }
    }
  }

  public void Hang() {
    for (MatHang q : y) {
      if (q.getMaMH().compareTo(this.maMH) == 0) {
        this.tenMH = q.getTenMH();
        this.donVi = q.getDonVi();
        this.giaMua = q.getGiaMua();
        this.giaBan = q.getGiaBan();
        this.thanhTien = this.giaBan * this.soLuong;
        return;
      }
    }
  }

  public String toString() {
    return this.maHD + " " + this.tenKH + " " + this.diaChi + " " + this.tenMH + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.soLuong + " " + this.thanhTien;
  }

}
