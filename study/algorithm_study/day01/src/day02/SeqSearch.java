package day02;

import java.util.Scanner;

public class SeqSearch {
	private static int seqSearch(int[] x, int num, int ky) {
		int i = 0; // 배열의 인덱스를 증가 시키는 변수
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
		System.out.print("요솟수");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}
}
