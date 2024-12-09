package J07015;

import java.util.*;
import java.io.*;

public class Main {
  public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        int[] cnt = new int[100005];
        for (Integer x : a) {
            if(prime(x)) {
                ts.add(x);
                cnt[x]++;
            }
        }
        for (Integer x : ts) {
            System.out.println(x + " " + cnt[x]);
        }
    }
}
