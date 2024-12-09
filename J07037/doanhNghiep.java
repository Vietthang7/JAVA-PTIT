package J07037;

public class doanhNghiep {

    private String ma, ten;
    private int soLuong;

    public doanhNghiep(String ma, String ten, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.soLuong;
    }
}
