package J05067;

import java.util.ArrayList;
import java.util.Scanner;

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
        for (donHang x : arr) {
            System.out.println(x);
        }
    }
}
