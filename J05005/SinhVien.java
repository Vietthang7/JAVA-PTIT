package J05005;

// public class SinhVien {
//   private String ma, ten, lop, ngaySinh;
//   private double gpa;

//   public SinhVien(String ma, String ten, String lop, String ngaySinh, double gpa) {
//     this.ma = ma;
//     this.ten = ten;
//     this.lop = lop;
//     this.ngaySinh = ngaySinh;
//     this.gpa = gpa;
//   }

//   public double getGpa() {
//     return gpa;
//   }

//   public void chuanHoa() {
//     String[] a = ten.trim().split("\\s+");
//     String name = "";
//     for (String x : a) {
//       name += Character.toUpperCase(x.charAt(0));
//       for (int i = 1; i < x.length(); i++) {
//         name += Character.toLowerCase(x.charAt(i));
//       }
//       name += " ";
//     }
//     ten = name.trim();
//     StringBuilder sb = new StringBuilder(ngaySinh);
//     if (sb.charAt(1) == "/") {
//       sb.insert(0, "0");
//     }
//     if (sb.charAt(4) == "/") {
//       sb.insert(3, "0");
//     }
//     ngaySinh = sb.toString();
//   }

//   public String toString() {
//     chuanHoa();
//     return ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
//   }
// }
