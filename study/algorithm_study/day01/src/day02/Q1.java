package day02;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ� ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = ���ʸ޼���(x, num, ky);
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
	}

	private static int ���ʸ޼���(int[] x, int num, int ky) {
		int i = 0;
		x[num] = ky;
		for (int j = 0; j < x.length; j++) {
			if(x[i] == ky) {
				break;
			}
			i++;
		}
		return i == num ? -1 : i;
	}
}
