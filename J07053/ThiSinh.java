package J07053;

public class ThiSinh {

    private String ma, ten, ngaySinh;
    private double lyThuyet, thucHanh;

    public ThiSinh(String ma, String ten, String ngaySinh, double lyThuyet, double thucHanh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
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
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        this.ngaySinh = sb.toString();

    }

    public double diemTB() {
        double diem = (this.lyThuyet + this.thucHanh) / 2.0;
        double res;
        if (this.lyThuyet >= 8 && this.thucHanh >= 8) {
            res = Math.round(diem + 1.0);
        } else if (this.lyThuyet >= 7.5 && this.thucHanh >= 7.5) {
            res = Math.round(diem + 0.5);
        } else {
            res = Math.round(diem);
        }
        return Math.round(Math.min(res, 10));
    }


    public int tuoi() {
        String nam = this.ngaySinh.substring(6);
        return 2021 - Integer.parseInt(nam);
    }

    public String xepLoai() {
        double result = diemTB();
        if (result >= 9) {
            return "Xuat sac";
        } else if (result >= 8) {
            return "Gioi";
        } else if (result >= 7) {
            return "Kha";
        } else if (result >= 5 && result <= 6) {
            return "Trung binh";
        } else {
            return "Truot";
        }
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + tuoi() + " " + String.format("%.0f", diemTB()) + " " + xepLoai();
    }
}
