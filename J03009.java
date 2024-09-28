import java.util.*;

public class J03009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String a = sc.nextLine();
      String b = sc.nextLine();
      String[] y1 = a.split("\\s+");
      String[] y2 = b.split("\\s+");
      TreeSet<String> s = new TreeSet<>();
      TreeSet<String> s1 = new TreeSet<>();
      for (String x : y1) {
        s.add(x);
      }
      for (String x : y2) {
        s1.add(x);
      }
      for( String x:s){
        if(!s1.contains(x)){
          System.out.print(x + " ");
        }
      }
      System.out.println();
    }
  }
}
