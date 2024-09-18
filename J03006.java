
import java.util.*;

public class J03006 {

    public static String solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                return "NO";
            }
        }
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }
}
