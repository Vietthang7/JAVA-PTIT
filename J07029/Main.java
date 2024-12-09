package J07029;

import java.io.*;
import java.util.*;

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
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (Integer x : arr) {
            if (prime(x)) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
            ++cnt;
            if (cnt == 10) {
                break;
            }
        }
    }
}
