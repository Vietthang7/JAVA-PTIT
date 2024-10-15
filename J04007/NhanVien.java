package J04007;

public class NhanVien {
  private String ten, sex, ngaySinh, diaChi, mst, hopDong;

  public NhanVien(String ten, String sex, String ngaySinh, String diaChi, String mst, String hopDong) {
    this.ten = ten;
    this.sex = sex;
    this.ngaySinh = ngaySinh;
    this.diaChi = diaChi;
    this.mst = mst;
    this.hopDong = hopDong;
  }

  public void inThongTin() {
    System.out.println("00001" + " " + ten + " " + sex + " " + ngaySinh + " " + diaChi + " " + mst + " " + hopDong);
  }
}
