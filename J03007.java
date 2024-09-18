
import java.util.*;

public class J03007 {

    public static String solve(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return "NO";
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        if (sum % 10 != 0) {
            return "NO";
        }
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        while (t-- > 0) {
            System.out.println(solve(sc.nextLine()));
        }
    }
}
