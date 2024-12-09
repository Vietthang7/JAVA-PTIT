package J06008;

import java.util.ArrayList;

public class GiangVien {
  private String maGV, tenGV;
  ArrayList<String> dsMon = new ArrayList<>();
  private double tongGio;

  public GiangVien(String maGV, String tenGV) {
    this.maGV = maGV;
    this.tenGV = tenGV;
  }

  public String getMaGV() {
    return maGV;
  }

  public String getTenGV() {
    return tenGV;
  }

  public double getTongGio() {
    return tongGio;
  }

  public void setTongGio(double tongGio) {
    this.tongGio = tongGio;
  }

  public String toString() {
    return this.maGV + " " + String.format("%.2f", tongGio);
  }
}
