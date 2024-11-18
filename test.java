import java.util.*;  

class SinhVien {  
    private String maSV;  
    private String hoTen;  
    private String ngaySinh;  
    private String lop;  
    private double gpa;  

    // Biến static để tự động tạo mã sinh viên  
    private static int count = 1;  

    // Constructor không tham số  
    public SinhVien() {  
        this.maSV = "B20DCCN" + String.format("%03d", count++);  
        this.hoTen = "";  
        this.ngaySinh = "";  
        this.lop = "";  
        this.gpa = 0.0;  
    }  

    // Hàm thiết lập thông tin sinh viên  
    public void setThongTin(String hoTen, String lop, String ngaySinh, double gpa) {  
        this.hoTen = hoTen.trim();  
        this.lop = lop.trim();  
        this.ngaySinh = normalizeDate(ngaySinh);  
        this.gpa = gpa;  
    }  

    // Hàm chuẩn hóa ngày sinh  
    private String normalizeDate(String date) {  
        String[] parts = date.split("/");  
        String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];  
        String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];  
        String year = parts[2];  
        return day + "/" + month + "/" + year;  
    }  

    // Hàm in thông tin sinh viên  
    @Override  
    public String toString() {  
        return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);  
    }  

    // Getter cho GPA  
    public double getGpa() {  
        return gpa;  
    }  
}  

public class test {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        List<SinhVien> listSinhVien = new ArrayList<>();  

        System.out.print("Nhap so sinh vien: ");  
        int n = Integer.parseInt(scanner.nextLine().trim());  

        for (int i = 0; i < n; i++) {  
            SinhVien sv = new SinhVien();  
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");  
            System.out.print("Ho ten: ");  
            String hoTen = scanner.nextLine().trim();  
            System.out.print("Lop: ");  
            String lop = scanner.nextLine().trim();  
            System.out.print("Ngay sinh: ");  
            String ngaySinh = scanner.nextLine().trim();  
            System.out.print("GPA: ");  
            double gpa = Double.parseDouble(scanner.nextLine().trim());  

            sv.setThongTin(hoTen, lop, ngaySinh, gpa);  
            listSinhVien.add(sv);  
        }  

        // Sắp xếp danh sách sinh viên theo GPA giảm dần  
        Collections.sort(listSinhVien, Comparator.comparingDouble(SinhVien::getGpa).reversed());  

        // In danh sách sinh viên  
        for (SinhVien sv : listSinhVien) {  
            System.out.println(sv);  
        }  
        scanner.close();  
    }  
}