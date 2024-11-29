package J04018;

import java.util.*;

public class SoPhuc {
  private int thuc, ao;

  public SoPhuc(int thuc, int ao) {
    this.thuc = thuc;
    this.ao = ao;
  }

  public SoPhuc add(SoPhuc a) {
    int x = this.thuc + a.thuc;
    int y = this.ao + a.ao;
    SoPhuc res = new SoPhuc(x, y);
    return res;
  }

  public SoPhuc mul(SoPhuc a) {
    int x = this.thuc * a.thuc - this.ao * a.ao;
    int y = this.thuc * a.ao + this.ao * a.thuc;
    SoPhuc res = new SoPhuc(x, y);
    return res;
  }

  public String toString() {
    String res = "";
    res += this.thuc + " ";
    if (this.ao < 0) {
      res += "- " + Math.abs(this.ao) + "i";
    } else {
      res += "+ " + Math.abs(this.ao) + "i";
    }
    return res;
  }
}