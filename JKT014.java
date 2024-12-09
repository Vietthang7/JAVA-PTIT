import java.io.*;
import java.util.*;

public class JKT014 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Đọc số lượng bộ test
        while(t-- > 0){  // Lặp qua tất cả các bộ test
            int n = sc.nextInt();  // Số ngày chứng khoán
            int[] a = new int[n];  // Mảng lưu giá chứng khoán của các ngày
            for(int i = 0; i < n; i++){  // Đọc giá chứng khoán cho các ngày
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();  // Ngăn xếp để lưu vị trí các ngày
            for(int i = 0; i < n; i++){  // Lặp qua từng ngày
                // Nếu giá chứng khoán ngày hiện tại >= giá chứng khoán ngày ở trên đỉnh ngăn xếp
                // thì xóa ngày trên đỉnh ngăn xếp vì nó không thỏa mãn điều kiện
                while(!st.empty() && a[i] >= a[st.peek()]){
                    st.pop();
                }
                // Nếu ngăn xếp rỗng, có nghĩa là ngày i không có ngày nào trước đó có giá bé hơn
                // hoặc bằng, vậy nhịp chứng khoán là i + 1 (tính từ ngày đầu tiên)
                if(st.empty()){
                    System.out.print((i+1) + " ");
                }
                else{
                    // Nếu không rỗng, tức là ngày i có ngày trước đó có giá bé hơn hoặc bằng,
                    // nhịp chứng khoán là khoảng cách từ ngày i đến ngày trước đó có giá lớn hơn
                    System.out.print((i - st.peek()) + " ");
                }
                // Đưa ngày hiện tại vào ngăn xếp
                st.push(i);
            }
            System.out.println();  // In ra kết quả cho mỗi test case
        }
    }
}
