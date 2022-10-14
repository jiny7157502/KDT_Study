package day02;

import java.util.Scanner;

public class SeqSearch {
	private static int seqSearch(int[] x, int num, int ky) {
		int i = 0; // �迭�� �ε����� ���� ��Ű�� ����
		while(true) {
			if(i==num) {
				return -1;
			}
			if(x[i] == ky) {
				return i;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
	}
}
