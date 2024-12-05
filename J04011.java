
//1. Tim toa do cac vecto AB→ , BC→
//
//2. Vecto phap tuyen cua mat phang (P) la n→=[AB→ , BC→ ]
//
//3. Diem thuoc mat phang: A (hoặc B, hoặc C)
//
//4. vIet phuong trinh mat phang di qua 1 diem va co vecto phap tuyen
//
//n→ =[ AB→ , BC→ ]



import java.util.Scanner;

class Point3D{
    public short x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = (short)x;
        this.y = (short)y;
        this.z = (short)z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) { 
        int det = determinant4x4(p1, p2, p3, p4); 
        return det == 0; 
    } 
    
    public static int determinant4x4(Point3D p1, Point3D p2, Point3D p3, Point3D p4) { 
        return p1.x * determinant3x3(p2.y, p2.z, 1, p3.y, p3.z, 1, p4.y, p4.z, 1) - p1.y 
                * determinant3x3(p2.x, p2.z, 1, p3.x, p3.z, 1, p4.x, p4.z, 1) + p1.z 
                * determinant3x3(p2.x, p2.y, 1, p3.x, p3.y, 1, p4.x, p4.y, 1) - 1 
                * determinant3x3(p2.x, p2.y, p2.z, p3.x, p3.y, p3.z, p4.x, p4.y, p4.z); 
    } 
    
    public static int determinant3x3(int a1, int a2, int a3, int b1, int b2, int b3, int c1, int c2, int c3) { 
        return a1 * (b2 * c3 - b3 * c2) - a2 * (b1 * c3 - b3 * c1) + a3 * (b1 * c2 - b2 * c1); 
    } 
    
//    static boolean check(Point3D A, Point3D B, Point3D C, Point3D D){
//        //vector AB
//        int a1 = B.x - A.x;
//        int a2 = B.y - A.y;
//        int a3 = B.z - A.y;
//        
//        //vector BC
//        int b1 = C.x - B.x;
//        int b2 = C.y - B.y;
//        int b3 = C.z - B.y;
//        
//        //vector CD
//        int c1 = C.x - D.x;
//        int c2 = C.y - D.y;
//        int c3 = C.z - D.y;
//        
//        //vector phap tuyen n = [AB,BC]
//        int d1 = a2*b3 - a3*b2;
//        int d2 = a3*b1 - a1*b3;
//        int d3 = a1*b2 - a2*b1;
//        
//        // kiem tra n voi CD co vuong goc
//        return c1*d1+c2*d2+c3*d3 == 0;
//    }
    
    
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
    