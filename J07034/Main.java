package J07034;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            arr.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            public int compare(MonHoc t, MonHoc t1) {
                return t.getTen().compareTo(t1.getTen());
            }
        });
        for (MonHoc x : arr) {
            System.out.println(x);
        }
    }
}
