package J04004;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PhanSo ps1 = new PhanSo(sc.nextLong(), sc.nextLong());
    PhanSo ps2 = new PhanSo(sc.nextLong(), sc.nextLong());
    System.out.println(ps1.add(ps2));
  }
}
