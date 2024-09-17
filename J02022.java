
import java.util.*;

public class J02022 {

    static int n;
    static int[] X = new int[1000];
    static boolean[] used = new boolean[1000];

    static void ql(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j] && Math.abs(j - X[i - 1]) != 1) {
                X[i] = j;
                used[j] = true;

                if (i == n) {
                    for (int k = 1; k <= n; k++) {
                        System.out.print(X[k]);
                    }
                    System.out.println();
                } else {
                    ql(i + 1);
                }
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            Arrays.fill(used, false);
            Arrays.fill(X, 0);
            X[0] = -1;
            ql(1);
        }
    }
}
