package J05026;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiangVien> arr = new ArrayList<>();
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= n; i++) {
      arr.add(new GiangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine()));
    }
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) { 
      String nganh = sc.nextLine().toUpperCase();
      String[] a = nganh.split("\\s+");
      String resultNganh = "";
      for (String x : a) {
        resultNganh += x.charAt(0);
      }
      System.out.println("DANH SACH GIANG VIEN BO MON " + resultNganh + ":");
      for (GiangVien x : arr) {
        if (x.nganh().compareTo(resultNganh) == 0) {
          System.out.println(x);
        }
      }
    }
  }
}
