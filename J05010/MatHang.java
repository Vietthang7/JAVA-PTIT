package J05010;

public class MatHang {
  private String ma, ten, nhomHang;
  double giaMua, giaBan;

  public MatHang(String ma, String ten, String nhomHang, double giaMua, double giaBan) {
    this.ma = ma;
    this.ten = ten;
    this.nhomHang = nhomHang;
    this.giaMua = giaMua;
    this.giaBan = giaBan;
  }

  public Double getLoiNhuan() {
    return this.giaBan - this.giaMua;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.nhomHang + " " + String.format("%.2f", getLoiNhuan());
  }

}
