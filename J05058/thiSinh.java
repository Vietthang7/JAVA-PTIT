package J05058;

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

    public String getMa() {
        return ma;
    }
    
    public int khuVuc() {
        String res = "";
        res += this.ma.charAt(2);
        return Integer.parseInt(res);
    }

    public double diemUT() {
        if (khuVuc() == 1) {
            return 0.5;
        } else if (khuVuc() == 2) {
            return 1.0;
        }
        return 2.5;
    }

    public double tongDiem() {
        return this.diemToan * 2 + this.diemLy + this.diemHoa + diemUT();
    }

    public String toString() {
        String res = "";
        int tmp = 0;
        if (tongDiem() >= 24) {
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
