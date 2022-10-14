package day02;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = 보초메서드(x, num, ky);
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

	private static int 보초메서드(int[] x, int num, int ky) {
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
