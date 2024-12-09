package J07031;

import java.util.*;
import java.io.*;

public class Main {

    public static boolean prime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer x : a) {
            if (x < 500000 && prime(x)) {
                int y = 1000000 - x;
                if (prime(y) && x < y && !b.contains(y) && !b.contains(x)) {
                    int k = a.indexOf(y);
                    if (k != -1) {
                        mp.put(x, y);
                    }
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);

        }
    }
}
