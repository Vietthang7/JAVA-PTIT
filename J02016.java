import java.util.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            HashSet<Long> mp = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mp.add((long) a[i] * a[i]);
            }
            boolean found = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long a2 = (long) a[i] * a[i];
                    long b2 = (long) a[j] * a[j];
                    long c2 = a2 + b2;
                    if(mp.contains(c2)){
                        found = true;
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            if(found){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
