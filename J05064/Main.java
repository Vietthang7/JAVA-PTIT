package J05064;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<giaoVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int ht = 0, hp = 0;
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String chucVu = s.substring(0, 2);
            giaoVien x = new giaoVien(s, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if (chucVu.compareTo("GV") == 0) {
                arr.add(x);
            } else {
                if (chucVu.compareTo("HP") == 0) {
                    if (hp < 2) {
                        arr.add(x);
                    }
                    hp++;
                } else {
                    if (ht < 1) {
                        arr.add(x);
                    }
                    ht++;
                }
            }
        }
        for (giaoVien x : arr) {
            System.out.println(x);
        }

    }
}
