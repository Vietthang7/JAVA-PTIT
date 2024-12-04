package J05030;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<bangDiem> bd = new ArrayList<>();
    while (t-- > 0) {
      sc.nextLine();
      bd.add(
          new bangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(bd, new Comparator<bangDiem>() {
      @Override
      public int compare(bangDiem o1, bangDiem o2) {
        return o1.getMaSV().compareTo(o2.getMaSV());
      }
    });
    int stt = 1;
    for (bangDiem x : bd) {
      System.out.print(stt + " ");
      stt++;
      System.out.println(x);
    }
  }
}
