package J07054;

public class sinhVien {

    private String ma, ten;
    private double mon1, mon2, mon3;
    private int xepHang;

    public sinhVien(String ma, String ten, double mon1, double mon2, double mon3) {
        this.ma = ma;
        this.ten = ten;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
        chuanHoa();
    }

    public void chuanHoa() {
        String[] res = this.ten.trim().split("\\s+");
        String name = "";
        for (String x : res) {
            String tmp = "";
            tmp += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) {
                tmp += Character.toLowerCase(x.charAt(i));
            }
            name += tmp + " ";
        }
        this.ten = name.trim();
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getMa() {
        return ma;
    }

    public double diemTB() {
        return (this.mon1 * 3 + this.mon2 * 3 + this.mon3 * 2) / 8;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + String.format("%.2f",diemTB()) + " " + this.xepHang;
                
    }
}
