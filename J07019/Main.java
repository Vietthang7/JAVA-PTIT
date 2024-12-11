package J07019;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            arr.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String[] res = sc.nextLine().trim().split("\\s+");
            String maHD = res[0];
            int soLuong = Integer.parseInt(res[1]);
            for (SanPham sp : arr) {
                if (sp.getMa().compareTo(maHD.substring(0, 2)) == 0) {
                    String loai = maHD.substring(2);
                    int donGia;
                    if (loai.compareTo("1") == 0) {
                        donGia = sp.getDonGia1();
                    } else {
                        donGia = sp.getDonGia2();
                    }
                    int thanhTien = donGia * soLuong;
                    double giamGia = 0.0;
                    if (soLuong >= 150) {
                        giamGia = thanhTien * 0.5;
                    } else if (soLuong >= 100) {
                        giamGia = thanhTien * 0.3;
                    } else if (soLuong >= 50) {
                        giamGia = thanhTien * 0.15;
                    }
                    double soTien = thanhTien - giamGia;
                    String ID = maHD + "-" + String.format("%03d", i);
                    System.out.println(ID + " " + sp.getTen() + " " + String.format("%.0f", giamGia) + " " + String.format("%.0f", soTien));
                }
            }
        }
    }
}
