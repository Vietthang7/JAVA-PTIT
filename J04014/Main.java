package J04014;

import java.util.*;
class PhanSo {
  private long tuSo, mauSo;

  public PhanSo(long tuSo, long mauSo) {
    this.tuSo = tuSo;
    this.mauSo = mauSo;
  }

  public long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  public void rutGon() {
    long gcd = gcd(this.tuSo, this.mauSo);
    this.tuSo /= gcd;
    this.mauSo /= gcd;
    if (this.mauSo < 0) {
      this.mauSo = Math.abs(this.mauSo);
      this.tuSo *= -1;
    }
  }

  public PhanSo add(PhanSo x) {
    long tuSo = this.mauSo * x.tuSo + this.tuSo * x.mauSo;
    long mauSo = this.mauSo * x.mauSo;
    PhanSo res = new PhanSo(tuSo, mauSo);
    return res;
  }

  public PhanSo multiplication(PhanSo x) {
    long tuSo = this.tuSo * x.tuSo;
    long mauSo = this.mauSo * x.mauSo;
    PhanSo result = new PhanSo(tuSo, mauSo);
    return result;
  }

  public String toString() {
    rutGon();
    return this.tuSo + "/" + this.mauSo;
  }

}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      PhanSo ps1 = new PhanSo(sc.nextLong(), sc.nextLong());
      PhanSo ps2 = new PhanSo(sc.nextLong(), sc.nextLong());
      PhanSo ps3 = ps1.add(ps2);
      PhanSo C = ps3.multiplication(ps3);
      PhanSo ps4 = ps1.multiplication(ps2);
      PhanSo D = ps4.multiplication(C);
      System.out.println(C + " " + D);
    }
  }
}