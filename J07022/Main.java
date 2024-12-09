package J07022;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int n = Integer.parseInt(s);
            } catch (Exception e) {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for (String x : arr) {
            System.out.print(x + " ");
        }
    }
}
