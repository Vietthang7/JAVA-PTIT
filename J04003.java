import java.util.*;

class PhanSo {
  private long tu, mau;

  public PhanSo(long tu, long mau) {
  this.tu = tu;
  this.mau = mau;
  }

  public void ToiGian() {
    long a = tu;
    long b = mau;
    while (b != 0) {
      long r = a % b;
      a = b;
      b = r;
    }
    tu /= a;
    mau /= a;
  }

  public String toString() {
    return tu + "/" + mau;
  }
}

public class J04003 {
  public static void main(String[] args) {
    Scanner sc = new Scanner((System.in));
    PhanSo s = new PhanSo(sc.nextLong(),sc.nextLong());
    s.ToiGian();
    System.out.println(s);
  }
}
