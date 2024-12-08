package J05064;

public class giaoVien {

    private String ma, ten;
    private int luongCB;

    public giaoVien(String ma, String ten, int luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
    }

    public int phuCap() {
        String cv = this.ma.substring(0, 2);
        if (cv.compareTo("HT") == 0) {
            return 2000000;
        } else if (cv.compareTo("HP") == 0) {
            return 900000;
        }
        return 500000;
    }

    public int heSo() {
        return Integer.parseInt(this.ma.substring(2));
    }

    public int tongLuong() {
        return heSo() * this.luongCB + phuCap();
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + heSo() + " " + phuCap() + " " + tongLuong();
    }
}
