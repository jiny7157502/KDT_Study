package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx04 {
	public static void main(String[] args) {
		String[][] arr = new String[10][2];
		arr[0][0] = "�й�";		
		arr[0][1] = "�̸�";
		arr[1][0] = "0397134";
		arr[1][1] = "��ȿ��";
		arr[2][0] = "0465345";
		arr[2][1] = "������";
		arr[3][0] = "0427214";
		arr[3][1] = "������";
		arr[4][0] = "0487342";
		arr[4][1] = "�迵��";
		arr[5][0] = "0512478";
		arr[5][1] = "�迹��";
		
		//Ű����� �Է� �޾Ƽ� �ֱ�
		//����ִ� �ε��� 5�� ���ؼ� ���⿡ �ֱ�
		int i = 0;
		boolean flag = false;
		for (; i < arr.length; i++) {
			if (arr[i][0] == null) {
				break;
			}
		}
		
		// 1) 0407357 ������ ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�й��� ");
		arr[i-1][0] = sc.next();
		System.out.print("�̸��� ");
		arr[i-1][1] = sc.next();
		
		for (String[] strings : arr) {
			for (String strings2 : strings) {
				System.out.print(strings2 + "\t");
			}
			System.out.println();
		}
		
		// 2) �迵�� ����
//		String deleteName = "�迵��";
//		int k = 0;
//		for (; k < arr.length; k++) {
//			if (arr[k][1].equals(deleteName)) {
//				break;
//			}
//		}
//		System.out.println(arr[k][1] + " " + k);
//		arr[k][0] = null;
//		arr[k][1] = null;
//		for (String[] strings : arr) {
//			for (String strings2 : strings) {
//				System.out.print(strings2 + "\t");
//			}
//			System.out.println();
//		}
		
		String searchName = "�迹��";
		boolean searchFlag = false;
		int n = 0;
		try { 
			for (; n < arr.length; n++) {
				if (arr[n][1].equals(searchName)) {
					searchFlag = true;
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("�츮 ���� �ƴմϴ�.");
		}
		

		
		if (!searchFlag) {
			System.out.println(arr[n][0] + " " + arr[n][1]);
		} else {
			
		}
	}
}
