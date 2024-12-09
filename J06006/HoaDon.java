package J06006;

import java.util.ArrayList;


public class HoaDon {
  private String maHD, maKH, maMH, tenKH, diaChi, tenMH;
  private long soLuong, thanhTien, loiNhuan;
  ArrayList<KhachHang> x = new ArrayList<>();
  ArrayList<matHang> y = new ArrayList<>();

  public HoaDon(String maHD, String maKH, String maMH, long soLuong, ArrayList<KhachHang> x, ArrayList<matHang> y) {
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
    for (matHang h : y) {
      if (h.getMaMH().compareTo(this.maMH) == 0) {
        this.tenMH = h.getTenMH();
        this.thanhTien = h.getGiaBan() * this.soLuong;
        this.loiNhuan = this.soLuong * (h.getGiaBan() - h.getGiaMua());
        return;
      }
    }
  }

  public String getMaHD() {
    return maHD;
  }

  public long getLoiNhuan() {
    return loiNhuan;
  }

  public String toString() {
    return this.maHD + " " + this.tenKH + " " + this.diaChi + " " + this.tenMH + " " + this.soLuong + " "
        + this.thanhTien + " " + this.loiNhuan;
  }

}
