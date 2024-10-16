package J05033;

import java.util.*;

class Time {
  private int gio, phut, giay;

  public Time() {
  }

  public Time(int gio, int phut, int giay) {
    this.gio = gio;
    this.phut = phut;
    this.giay = giay;
  }

  public int getGio() {
    return gio;
  }

  public int getPhut() {
    return phut;
  }

  public int getGiay() {
    return giay;
  }

  public String toString() {
    return gio + " " + phut + " " + giay;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Time> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr, new Comparator<Time>() {
      public int compare(Time t, Time t1) {
        if (t.getGio() != t1.getGio()) {
          return t.getGio() - t1.getGio();
        } else {
          if (t.getPhut() != t1.getPhut()) {
            return t.getPhut() - t1.getPhut();
          } else {
            if (t.getGiay() != t1.getGiay()) {
              return t.getGiay() - t1.getGiay();
            }
          }
        }
        return -1;
      }
    });
    for (Time x : arr) {
      System.out.println(x);
    }
  }
}
