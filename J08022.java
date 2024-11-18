import java.util.*;

public class J08022 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      int n = Integer.parseInt(sc.nextLine());
      int[] q = new int[n];
      int[] r = new int[n];

      String[] a = sc.nextLine().trim().split("\\s+");
      for (int i = 0; i < n; i++) {
        q[i] = Integer.parseInt(a[i]);
      }
      Stack<Integer> st = new Stack<>();
      for (int i = n - 1; i >= 0; i--) {
        while (!st.isEmpty() && st.peek() <= q[i]) {
          st.pop();
        }
        if (st.isEmpty()) {
          r[i] = -1;
        } else {
          r[i] = st.peek();
        }
        st.push(q[i]);
      }
      for (int i = 0; i < n; i++) {
        System.out.print(r[i] + " ");
      }
      System.out.println();
    }
  }
}
