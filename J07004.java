
import java.util.*;
import java.io.*;

public class J07004 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] f = new int[1001];
        while (sc.hasNextInt()) {
            ++f[sc.nextInt()];
        }
        for (int i = 0; i <= 1000; i++) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
            }
        }

    }
}
