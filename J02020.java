
import java.util.*;

public class J02020 {

    static int n, k;
    static int cnt = 0;

    static void Try(int i, String s) {
        if (s.trim().split(" ").length == k) {
            System.out.println(s.trim());
            ++cnt;
            return;
        }
        for (int j = i; j <= n; j++) {
            Try(j + 1, s + j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1, "");
        System.out.println("Tong cong co " + cnt + " to hop");

    }
}
