import java.util.Scanner;

public class J02023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		if (s == 0) {
			if (n == 1) {
				System.out.println("0 0");
			} else {
				System.out.println("-1 -1");
			}
            return;
		}
		if (s > n * 9) {
			System.out.println("-1 -1");
            return;
		}
		// Tìm số nhỏ nhất
		StringBuilder minNumber = new StringBuilder();
		int remainingSum = s;
		for (int i = 0; i < n; i++) {
			for (int digit = (i == 0 ? 1 : 0); digit <= 9; digit++) {
				if (remainingSum - digit >= 0 && remainingSum - digit <= 9 * (n - i - 1)) {
					minNumber.append(digit);
					remainingSum -= digit;
					break;
				}
			}
		}
		// Tìm số lớn nhất
		StringBuilder maxNumber = new StringBuilder();
		remainingSum = s;
		for (int i = 0; i < n; i++) {
			for (int digit = 9; digit >= (i == 0 ? 1 : 0); digit--) {
				if (remainingSum - digit >= 0 && remainingSum - digit <= 9 * (n - i - 1)) {
					maxNumber.append(digit);
					remainingSum -= digit;
					break;
				}
			}
		}
		System.out.println(minNumber + " " + maxNumber);
	}
}
