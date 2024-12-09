package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {

    private String kyHieu, ten;
    private int donGia;
    private double phiPV;

    public LoaiPhong(String s) {
        String[] a = s.trim().split("\\s+");
        this.kyHieu = a[0];
        this.ten = a[1];
        this.donGia = Integer.parseInt(a[2]);
        this.phiPV = Double.parseDouble(a[3]);
    }

    public int compareTo(LoaiPhong t) {
        return this.ten.compareTo(t.ten);
    }

    public String toString() {
        return this.kyHieu + " " + this.ten + " " + this.donGia + " " + this.phiPV;
    }
}
