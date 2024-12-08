package J05068;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<donHang> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            donHang x = new donHang(s[0], Integer.parseInt(s[1]));
            String tmp = s[0].substring(3);
            if (tmp.compareTo("BP") == 0) {
                x.setHangSX("British Petro");
            } else if (tmp.compareTo("ES") == 0) {
                x.setHangSX("Esso");
            } else if (tmp.compareTo("SH") == 0) {
                x.setHangSX("Shell");
            } else if (tmp.compareTo("CA") == 0) {
                x.setHangSX("Castrol");
            } else if (tmp.compareTo("MO") == 0) {
                x.setHangSX("Mobil");
            } else {
                x.setHangSX("Trong Nuoc");
            }
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<donHang>() {
            public int compare(donHang t, donHang t1) {
                if (t.thanhTien() <= t1.thanhTien()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (donHang x : arr) {
            System.out.println(x);
        }
    }
}
