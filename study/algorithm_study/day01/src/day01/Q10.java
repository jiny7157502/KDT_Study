package day01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
//		System.out.print("���ڸ� �Է��ϼ��� ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int result = 0;
//		while (num > 0) {
//			num /= 10;
//			result++;
//		}
//		System.out.println("�� ���ڴ� " + result + "�ڸ� �����Դϴ�.");

		boolean x = false, y = true;
		if(x && y) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
		if ( !(!x || !y)) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
	}
}
