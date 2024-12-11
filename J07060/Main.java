package J07060;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap<String, String> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            mp.put(a, b);
        }
        sc = new Scanner(new File("CATHI.in"));
        ArrayList<caThi> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            arr.add(new caThi("C" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String[] res = sc.nextLine().trim().split("\\s+");
            String maCaThi = res[0];
            String maMon = res[1];
            for (int h = 0; h < arr.size(); h++) {
                if (arr.get(h).getMaCaThi().compareTo(maCaThi) == 0) {
                    arr.get(h).setMonThi(mp.get(maMon));
                    arr.get(h).setNhomThi(res[2]);
                    arr.get(h).setSoLuong(Integer.parseInt(res[3]));
                    break;
                }
            }
        }
        Collections.sort(arr, new Comparator<caThi>() {
            public int compare(caThi t, caThi t1) {
                if (t.getNgayThi().compareTo(t1.getNgayThi()) != 0) {
                    return t.getNgayThi().compareTo(t1.getNgayThi());
                } else {
                    if (t.getGioThi().compareTo(t1.getGioThi()) != 0) {
                        return t.getGioThi().compareTo(t1.getGioThi());
                    } else {
                        return t.getMaCaThi().compareTo(t1.getMaCaThi());
                    }
                }
            }
        });
        for (caThi x : arr) {
            System.out.println(x);
        }
    }
}
