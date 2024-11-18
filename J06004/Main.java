package J06004;

import java.util.*;

class SinhVien {
  private String ma, ten, sdt, stt;

  public SinhVien(String ma, String ten, String sdt, String stt) {
    this.ma = ma;
    this.ten = ten;
    this.sdt = sdt;
    this.stt = stt;
  }

  public String getMa() {
    return ma;
  }

  public String getStt() {
    return stt;
  }

  public void chuanHoa() {
    String[] a = this.ten.trim().split("\\s+");
    String name = "";
    for (String x : a) {
      name += Character.toUpperCase(x.charAt(0));
      for (int i = 1; i < x.length(); i++) {
        name += Character.toLowerCase(x.charAt(i));
      }
      name += " ";
    }
    this.ten = name.trim();
  }

  public String toString() {
    chuanHoa();
    return ma + " " + ten + " " + sdt + " " + stt;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] a = (sc.nextLine().trim().split("\\s+"));
    int n = Integer.parseInt(a[0]);
    int m = Integer.parseInt(a[1]);
    ArrayList<SinhVien> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
      arr.add(s);
    }
    HashMap<String, String> mp = new HashMap<>();
    for (int i = 1; i <= m; i++) {
      mp.put(i + "", sc.nextLine());
    }
    Collections.sort(arr, new Comparator<SinhVien>() {
      public int compare(SinhVien t, SinhVien t1) {
        return t.getMa().compareTo(t1.getMa());
      }
    });
    for (SinhVien k : arr) {
      System.out.print(k + " ");
      System.out.println(mp.get(k.getStt()));
    }
  }
}
