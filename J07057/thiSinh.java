package J07057;

public class thiSinh {

    private String ma, ten, danToc;
    private double diemThi;
    private int khuVuc;

    public thiSinh(String ma, String ten, double diemThi, String danToc, int khuVuc) {
        this.ma = ma;
        this.ten = ten;
        this.danToc = danToc;
        this.diemThi = diemThi;
        this.khuVuc = khuVuc;
        chuanHoa();
    }

    public void chuanHoa() {
        String[] res = this.ten.trim().split("\\s+");
        String name = "";
        for (String x : res) {
            name += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) {
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        this.ten = name.trim();
    }

    public double tongDiem() {
        double diem = this.diemThi;
        if (this.khuVuc == 1) {
            if (danToc.compareTo("Kinh") != 0) {
                return diem + 1.5 + 1.5;
            } else {
                return diem + 1.5;
            }
        } else if (this.khuVuc == 2) {
            if (danToc.compareTo("Kinh") != 0) {
                return diem + 1 + 1.5;
            } else {
                return diem + 1;
            }
        } else {
            if (danToc.compareTo("Kinh") != 0) {
                return diem + 1.5;
            } else {
                return diem;
            }

        }
    }

    public String result() {
        double diemFinal = tongDiem();
        if (diemFinal >= 20.5) {
            return "Do";
        } else {
            return "Truot";
        }
    }

    public String getMa() {
        return ma;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + String.format("%.1f", tongDiem()) + " " + result();
    }
}
