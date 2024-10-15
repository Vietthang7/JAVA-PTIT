package Lop_Sinh_Vien;

public class SinhVien {
  private String ten, ngaySinh, lop;
  private double gpa;

  public SinhVien(String ten, String ngaySinh, String lop, double gpa) {
    this.ten = ten;
    this.lop = lop;
    this.ngaySinh = ngaySinh;
    this.gpa = gpa;
  }

  public void chuanHoa() {
    StringBuilder sb = new StringBuilder(ngaySinh);
    if (sb.charAt(1) == '/') {
      sb.insert(0, "0");
    }
    if (sb.charAt(4) == '/') {
      sb.insert(3, "0");
    }
    ngaySinh = sb.toString();
  }

  public void inThongTin() {
    System.out.println("B20DCCN001" + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa));
  }

}
