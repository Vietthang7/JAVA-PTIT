package J07050;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<matHang> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            arr.add(new matHang("MH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<matHang>() {
            public int compare(matHang t, matHang t1) {
                if (t.loiNhuan() < t1.loiNhuan()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (matHang x : arr) {
            System.out.println(x);
        }

    }
}
