package J05032;

import java.util.*;

public class Main {
  public static String tuoi(String s) {
    String[] a = s.split("/");
    String tmp = "";
    for (int i = a.length - 1; i >= 0; i--) {
      tmp += a[i];
    }
    return tmp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tre = "", gia = "", Max = "", Min = "Z";
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < n; i++) {
      String ten = sc.next();
      String ns = sc.next();
      String age = tuoi(ns);
      if (Max.compareTo(age) < 0) {
        gia = ten;
        Max = age;
      }
      if (Min.compareTo(age) > 0) {
        tre = ten;
        Min = age;
      }
    }
    System.out.println(gia + "\n" + tre);
  }
}
