package J07030;

import java.util.*;
import java.io.*;

public class Main {

    public static boolean prime(int n) {
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
            if (prime(x) && x < 500000) {
                int y = 1000000 - x;
                if (prime(y)) {
                    int k = b.indexOf(y);
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
