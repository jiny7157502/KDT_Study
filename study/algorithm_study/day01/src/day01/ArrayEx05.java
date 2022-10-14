package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		String[][] arr = new String[5][2];
		arr[0][0] = "0397134";		
		arr[0][1] = "김효진";
		arr[1][0] = "0397134";
		arr[1][1] = "김효진";
		arr[2][0] = "0465345";
		arr[2][1] = "이종협";
		arr[3][0] = "0427214";
		arr[3][1] = "서상준";
		arr[4][0] = "0487342";
		arr[4][1] = "배영미";

		String[][] so = new String[5][2];
		int num = Integer.parseInt(arr[0][0]);
		int minNumIndex = 0;
		int minNum = num;
		int soIndex = 0;
		for(int k=0; k<arr.length; k++) {
			for (int i = 0; i < arr.length; i++) {
				if (minNum > Integer.parseInt(arr[i][0])) { 
					minNum = Integer.parseInt(arr[i][0]);
					minNumIndex = i;
				}
			}
			so[soIndex][0] = String.valueOf(minNum);
			so[soIndex][1] = arr[minNumIndex][1];
			System.out.println(so[soIndex][0] + " " + so[soIndex][1]);
			arr[minNumIndex][0] = "9999999";
			soIndex++;
		}
		
		//키보드로 입력 받아서 넣기
		//비어있는 인덱스 5를 구해서 여기에 넣기
//		int i = 0;
//		boolean flag = false;
//		for (; i < arr.length; i++) {
//			if (arr[i][0] == null) {
//				break;
//			}
//		}
		
//		// 1) 0407357 정성미 삽입
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학번은 ");
//		arr[i-1][0] = sc.next();
//		System.out.print("이름은 ");
//		arr[i-1][1] = sc.next();
//		
//		for (String[] strings : arr) {
//			for (String strings2 : strings) {
//				System.out.print(strings2 + "\t");
//			}
//			System.out.println();
//		}
		
		// 2) 배영미 삭제
//		String deleteName = "배영미";
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
		
//		String searchName = "김예진";
//		boolean searchFlag = false;
//		int n = 0;
//		try { 
//			for (; n < arr.length; n++) {
//				if (arr[n][1].equals(searchName)) {
//					searchFlag = true;
//					break;
//				}
//			}
//		} catch (NullPointerException e) {
//			System.out.println("우리 반이 아닙니다.");
//		}
//		
//
//		
//		if (!searchFlag) {
//			System.out.println(arr[n][0] + " " + arr[n][1]);
//		} else {
//			
//		}
	}
}
