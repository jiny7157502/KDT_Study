package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 30page Q7 �ڵ� �����
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum;
		
		System.out.print("n����? ");
		n = sc.nextInt();
		sum = 0;
		
		for (int i = 0; i < n+1; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ����? " + sum);
	}

}
