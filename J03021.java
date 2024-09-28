
import java.util.*;

public class J03021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Đọc dòng còn lại

    // Bản đồ để ánh xạ ký tự về số
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('A', 2);
    map.put('B', 2);
    map.put('C', 2);
    map.put('D', 3);
    map.put('E', 3);
    map.put('F', 3);
    map.put('G', 4);
    map.put('H', 4);
    map.put('I', 4);
    map.put('J', 5);
    map.put('K', 5);
    map.put('L', 5);
    map.put('M', 6);
    map.put('N', 6);
    map.put('O', 6);
    map.put('P', 7);
    map.put('Q', 7);
    map.put('R', 7);
    map.put('S', 7);
    map.put('T', 8);
    map.put('U', 8);
    map.put('V', 8);
    map.put('W', 9);
    map.put('X', 9);
    map.put('Y', 9);
    map.put('Z', 9);

    while (t-- > 0) {
      String s = sc.nextLine().toUpperCase(); // Chuyển đổi tất cả sang chữ hoa
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (map.containsKey(s.charAt(i))) {
          result.append(map.get(s.charAt(i)));
        }
      }
      String resultFinal = result.toString();
      String resultFinalrev = result.reverse().toString();
      if (resultFinal.equals(resultFinalrev)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close(); // Đóng Scanner
  }
}