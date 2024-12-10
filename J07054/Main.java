package J07054;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<sinhVien> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            arr.add(new sinhVien("SV" + String.format("%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<sinhVien>() {
            public int compare(sinhVien t, sinhVien t1) {
                if (t.diemTB() != t1.diemTB()) {
                    if (t.diemTB() < t1.diemTB()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return t.getMa().compareTo(t1.getMa());
                }
            }
        });
        arr.get(0).setXepHang(1);
        System.out.println(arr.get(0));
        for (int i = 1; i < n; i++) {
            if (arr.get(i).diemTB() == arr.get(i - 1).diemTB()) {
                arr.get(i).setXepHang(arr.get(i - 1).getXepHang());
            } else {
                arr.get(i).setXepHang(i+1);
            }
            System.out.println(arr.get(i));
        }
    }
}
