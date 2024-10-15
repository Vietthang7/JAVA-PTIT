package J04012;

// class NhanVien {
//   private String ten, chucvu;
//   private Long luongCoBan, soNgayCong;

//   public NhanVien(String ten, String chucvu, Long luongCoBan, Long soNgayCong) {
//     this.ten = ten;
//     this.chucvu = chucvu;
//     this.luongCoBan = luongCoBan;
//     this.soNgayCong = soNgayCong;
//   }

//   public String getChucvu() {
//     return chucvu;
//   }

//   public Long getLuongCoBan() {
//     return luongCoBan;
//   }

//   public Long getSoNgayCong() {
//     return soNgayCong;
//   }

//   public Long PhuCap() {
//     String cv = getChucvu();
//     if (cv.equals("GD")) {
//       return 250000;
//     }
//     if (cv.equals("PGD")) {
//       return 200000;
//     }
//     if (cv.equals("TP")) {
//       return 180000;
//     }
//     return 150000;
//   }

//   public Long TienLuong() {
//     return this.luongCoBan * this.soNgayCong;
//   }

//   public Long TienThuong() {
//     Long TienLuong = TienLuong();
//     Long day = soNgayCong();
//     if (day >= 25) {
//       return TienLuong * 0.2;
//     }
//     if (day < 25 && day >= 22) {
//       return TienLuong * 0.1;
//     }
//     return 0;
//   }

//   public Long ThuNhap() {
//     return TienLuong() + TienThuong() + PhuCap();
//   }

//   public String toString() {
//     return "NV01" + ten + " " + TienLuong() + " " + TienLuong() + " " + PhuCap() + " " + ThuNhap();
//   }
// }
