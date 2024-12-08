package J05067;

public class donHang {

    private String ma, hangSX;
    private int soLuong;

    public donHang(String ma, int soLuong) {
        this.ma = ma;
        this.soLuong = soLuong;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public long donGia() {
        Character x = this.ma.charAt(0);
        if (x == 'X') {
            return 128000;
        } else if (x == 'D') {
            return 11200;
        }
        return 9700;
    }

    public long thue() {
        Character x = this.ma.charAt(0);
        if (this.ma.substring(3).equals("TN")) {
            return 0;
        }
        long sum = donGia() * this.soLuong;
        if (x == 'X') {
            return Math.round(sum * 0.03);
        } else if (x == 'D') {
            return Math.round(sum * 0.035);
        } else {
            return Math.round(sum * 0.02);
        }
    }

    public long thanhTien() {
        return thue() + donGia() * this.soLuong;
    }

    public String toString() {
        return this.ma + " " + this.hangSX + " " + donGia() + " " + thue()+ " " + thanhTien();
    }

}
