
import java.util.*;

public class J03004 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            for (int i = 0; i < s.length; i++) {
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
            }
            System.out.println(String.join(" ", s));
//            for (int i = 0; i < s.length; i++) {
//                System.out.print(s[i] + " ");
//            }
//            System.out.println();
        }
    }
}
