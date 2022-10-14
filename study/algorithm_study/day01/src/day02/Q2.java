package day02;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int[] a = {6, 4, 3, 2, 1, 9, 8};
		int key = 3;
		
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + "|" + "*");
			for (int aa : a) {
				System.out.print(" ");
				System.out.print(aa);
			}
			System.out.println();
		}
	}
}
