package J05011;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TinhGio {
  private String ma, ten, gioVao, gioRa;

  public TinhGio(String ma, String ten, String gioVao, String gioRa) {
    this.ma = ma;
    this.ten = ten;
    this.gioVao = gioVao;
    this.gioRa = gioRa;
  }

  public long soPhut() {
    LocalTime x = LocalTime.parse(gioVao, DateTimeFormatter.ofPattern("HH:mm"));
    LocalTime y = LocalTime.parse(gioRa, DateTimeFormatter.ofPattern("HH:mm"));
    return Duration.between(x, y).toMinutes();
  }

  public String thoiGian() {
    long m = soPhut();
    long gio = m / 60;
    long phut = m - gio * 60;
    return gio + " gio " + phut + " phut";
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.thoiGian();
  }

}
