package J05013;

import java.util.*;

// public class TuyenDung {
//   private String ma, ten;
//   private double lyThuyet, thucHanh;

//   public TuyenDung(String ma, String ten, double lyThuyet, double thucHanh) {
//     this.ma = ma;
//     this.ten = ten;
//     this.lyThuyet = lyThuyet;
//     this.thucHanh = thucHanh;
//   }

//   public double diemTB() {
//     if (this.lyThuyet > 10) {
//       this.lyThuyet /= 10.0;
//     }
//     if (this.thucHanh > 10) {
//       this.thucHanh /= 10.0;
//     }
//     return (this.lyThuyet + this.thucHanh) / 2.0;
//   }

//   public String ketQua() {
//     if (diemTB() < 5) {
//       return "TRUOT";
//     } else if (diemTB() >= 5 && diemTB() < 8) {
//       return "CAN NHAC";
//     } else if (diemTB() >= 8 && diemTB() < 9.5) {
//       return "DAT";
//     } else {
//       return "XUAT XAC";
//     }
//   }

//   public String toString() {
//     return ma + " " + ten + " " + String.format("%.2f", diemTB()) + " " + ketQua();
//   }
// }
