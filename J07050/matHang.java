package J07050;

public class matHang {

    private String ma, ten, nhom;
    private double giaMua, giaBan;

    public matHang(String ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f",loiNhuan());
    }
}
