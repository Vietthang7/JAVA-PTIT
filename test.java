import java.util.*;

public class test {
  public static String find(int N) {
    Queue<String> q = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    q.add("9");
    while (!q.isEmpty()) {
      String current = q.poll();
      int n = Integer.parseInt(current) % N;
      if (n == 0) {
        return current;
      }
      if (!visited.contains(n)) {
        visited.add(n);
        q.add(current + "9");
        q.add(current + "0");
      }
    }
    return "";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      System.out.println(find(n));
    }
    sc.close();
  }
}