package J05057;

public class thiSinh {

    private String ma, ten;
    private double diemToan, diemLy, diemHoa;

    public thiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public int khuVuc() {
        String tmp = "";
        tmp += this.ma.charAt(2);
        return Integer.parseInt(tmp);
    }

    public double tongDiem() {
        return this.diemToan * 2 + this.diemLy + this.diemHoa;
    }

    public String toString() {
        String res = "";
        int tmp = 0;
        double uuTien;
        if (khuVuc() == 1) {
            uuTien = 0.5;
        } else if (khuVuc() == 2) {
            uuTien = 1;
        } else {
            uuTien = 2.5;
        }
        if (tongDiem() + uuTien >= 24) {
            res += "TRUNG TUYEN";
        } else {
            res += "TRUOT";
        }
        if (khuVuc() == 2) {
            if (tongDiem() == (int) tongDiem()) {
                tmp = (int) tongDiem();
                return this.ma + " " + this.ten + " " + 1 + " " + tmp + " " + res;
            } else {
                return this.ma + " " + this.ten + " " + 1 + " " + String.format("%.1f", tongDiem()) + " " + res;
            }
        } else if (khuVuc() == 1) {
            if (tongDiem() == (int) tongDiem()) {
                tmp = (int) tongDiem();
                return this.ma + " " + this.ten + " " + "0.5" + " " + tmp + " " + res;
            } else {
                return this.ma + " " + this.ten + " " + "0.5" + " " + String.format("%.1f", tongDiem()) + " " + res;
            }
        } else {
            if (tongDiem() == (int) tongDiem()) {
                tmp = (int) tongDiem();
                return this.ma + " " + this.ten + " " + "2.5" + " " + tmp + " " + res;
            } else {
                return this.ma + " " + this.ten + " " + "2.5" + " " + String.format("%.1f", tongDiem()) + " " + res;
            }
        }

    }
}
