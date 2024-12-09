package J07037;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<doanhNghiep> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            arr.add(new doanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(arr, new Comparator<doanhNghiep>() {
            public int compare(doanhNghiep t, doanhNghiep t1) {
                return t.getMa().compareTo(t1.getMa());
            }
        });
        for (doanhNghiep x : arr) {
            System.out.println(x);
        }
    }
}
