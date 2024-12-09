
import java.util.*;

public class J08024 {

    public static String findSmallestNumber(int N) {
        // Hàng đợi dùng cho BFS
        Queue<String> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add("9");
        while (!q.isEmpty()) {
            String current = q.poll();
            int soDu = Integer.parseInt(current) % N;
            if (soDu == 0) {
                return current;
            }
            if (!visited.contains(soDu)) {
                visited.add(soDu);
                q.add(current + "9");
                q.add(current + "0");
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Số lượng test case

        while (T-- > 0) {
            int N = sc.nextInt(); // Đọc số N cho mỗi test case
            System.out.println(findSmallestNumber(N));
        }

        sc.close();
    }
}
