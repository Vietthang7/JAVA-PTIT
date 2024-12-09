package J07032;

import java.util.*;
import java.io.*;

public class Main {

    public static boolean check(int s) {
        String res = "" + s;
        StringBuilder sb = new StringBuilder(res);
        String tmp = sb.reverse().toString();
        if (res.compareTo(tmp) != 0) {
            return false;
        }
        for (char x : res.toCharArray()) {
            if ((x - '0') % 2 == 0) {
                return false;
            }
        }
        if (res.length() % 2 == 0) {
            return false;
        }
        if (res.length() == 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();
        int[] cnt1 = new int[1000005];
        int[] cnt2 = new int[1000005];
        for (Integer x : arr1) {
            if (check(x)) {
                cnt1[x]++;
            }
        }
        for (Integer x : arr2) {
            if (check(x)) {
                cnt2[x]++;
            }
        }
        int ans = 0;
        for (int i = 10; i <= 1000004; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                ans++;
                if (ans == 10) {
                    break;
                }
            }
        }
    }
}
