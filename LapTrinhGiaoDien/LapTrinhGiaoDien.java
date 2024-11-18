package LapTrinhGiaoDien;

import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LapTrinhGiaoDien {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Home");
        JButton btn = new JButton("Click!");
        frame.add(btn);
        btn.setBounds(30, 30, 80, 30);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Đóng chương trình
        frame.setLocationRelativeTo(null); // Đặt cửa sổ màn hình
        frame.setLayout(null);
        frame.setVisible(true);// Hiển thị lên
    }
}
