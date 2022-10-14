package day01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// 30page Q7 코드 만들기
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum;
		
		System.out.print("n값은? ");
		n = sc.nextInt();
		sum = 0;
		
		for (int i = 0; i < n+1; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은? " + sum);
	}

}
