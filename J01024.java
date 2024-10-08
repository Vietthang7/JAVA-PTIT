
import java.util.*;

public class J01024 {

    public static String solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '2') {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}
