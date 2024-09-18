
import java.io.*;
import java.util.*;

public class J07002 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        long sum = 0;
        while (sc.hasNext()) {
            s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }

}
