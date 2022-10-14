package day01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
//		System.out.print("숫자를 입력하세요 ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int result = 0;
//		while (num > 0) {
//			num /= 10;
//			result++;
//		}
//		System.out.println("이 숫자는 " + result + "자리 숫자입니다.");

		boolean x = false, y = true;
		if(x && y) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		if ( !(!x || !y)) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
	}
}
