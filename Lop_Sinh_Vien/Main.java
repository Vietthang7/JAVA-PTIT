package Lop_Sinh_Vien;

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Đọc thông tin sinh viên
    String ten = sc.nextLine();
    String ngaySinh = sc.nextLine();
    String lop = sc.nextLine();
    double gpa = sc.nextDouble();

    // Tạo đối tượng SinhVien
    SinhVien s = new SinhVien(ten, ngaySinh, lop, gpa);

    // Chuẩn hóa và in thông tin
    s.chuanHoa();
    s.inThongTin();

    sc.close(); // Để đóng scanner
  }
}