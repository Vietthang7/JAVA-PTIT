package J05029;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<doanhNghiep> dn = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            dn.add(new doanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(dn, new Comparator<doanhNghiep>() {
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                if (o1.getSoLuong() != o2.getSoLuong())
                    return o2.getSoLuong() - o1.getSoLuong();
                else
                    return o1.getMaDN().compareTo(o2.getMaDN());
            }
        });
        int q = sc.nextInt();
        while (q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (doanhNghiep x : dn) {
                if (x.getSoLuong() >= a && x.getSoLuong() <= b) {
                    System.out.println(x);
                }
            }
        }
    }
}
