package day01;

public class ArrayEx03 {
	public static void main(String[] args) {
		String[][][] arr = {{{"a", "b"},{"c", "d"},{"e", "f"}},
				{{"g", "h"}, {"i", "j"}, {"k", "l"}}};
		
		System.out.println("���� ���� " + arr.length);
		System.out.println("���� ���� " + arr[0].length);
		System.out.println("���� ���� " + arr[0][0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
