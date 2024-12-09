package J07048;

public class sanPham {
    private String maSP, tenSP;
    private int giaBan, baoHanh;

    public sanPham(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String toString(){
        return this.maSP+" "+this.tenSP+" "+this.giaBan+" "+this.baoHanh;
    }
}
