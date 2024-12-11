package J07019;

public class SanPham {

    private String ma, ten;
    private int donGia1, donGia2;

    public SanPham(String ma, String ten, int donGia1, int donGia2) {
        this.ma = ma;
        this.ten = ten;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getDonGia1() {
        return donGia1;
    }

    public int getDonGia2() {
        return donGia2;
    }
    
}
