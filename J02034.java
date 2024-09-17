
import java.util.*;

public class J02034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        if (a.size() == n && n == a.get(n - 1)) {
            System.out.println("Excellent!");
        } else {
            for (int i = 1; i <= a.get(n - 1); i++) {
                if (!a.contains(i)) {
                    System.out.println(i);
                }
            }
        }

    }
}
