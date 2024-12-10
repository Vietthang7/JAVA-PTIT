package J07085;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static int sum(String s) {
        int sum = 0;
        for (char x : s.toCharArray()) {
            sum += (x - '0');
        }
        return sum;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        PrintWriter pw = new PrintWriter(new File("Output.out"));
        ArrayList<String> arr = (ArrayList<String>) in.readObject();
        for (String x : arr) {
            String res = "";
            for (char k : x.toCharArray()) {
                if (Character.isDigit(k)) {
                    res += k;
                }
            }
            BigInteger t = new BigInteger(res);
            pw.println(t.toString() + " " + sum(res));
        }
        pw.close();
        in.close();
    }
}
