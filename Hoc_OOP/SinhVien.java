package Hoc_OOP;
public class SinhVien {
  private String ten, ngaySinh;
  private double gpa;// đây là thuộc tính

  public void dangKiHoc() {// Đây là phương thức
    System.out.println("Sinh vien co the dang ki mon hoc");
  }
  // Getter and Setter
  public String getTen() {
    return ten;
  }

  public void setTen(String tenMoi) {
    ten = tenMoi;
  }

  public String getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(String ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  } 
  // End Getter and Setter

  // Constructor
  public SinhVien(String ten, String ngaySinh, double gpa) {
    this.ten = ten;
    this.ngaySinh = ngaySinh;
    this.gpa = gpa;
  }
}
