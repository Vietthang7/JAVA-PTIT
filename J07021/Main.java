package J07021;

import java.util.*;
import java.io.*;

public class Main {

    public static String chuanHoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.compareTo("END") == 0) {
                break;
            }
            String[] res = s.trim().split("\\s+");
            String ans = "";
            for (String x : res) {
                ans += chuanHoa(x) + " ";
            }
            System.out.println(ans.trim());
        }
    }
}
