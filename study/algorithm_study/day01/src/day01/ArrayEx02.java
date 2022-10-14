package day01;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int result1, result2;
		
		arr[0][0] = 100;
		arr[0][1] = 95;
		arr[0][2] = 90;
		arr[1][0] = 85;
		arr[1][1] = 80;
		arr[1][2] = 75;
		
		result1 = arr[0][0] + arr[0][1] + arr[0][2];
		result2 = arr[1][0] + arr[1][1] + arr[1][2];
  		System.out.println("0행의 합은 " + result1 + "이고, 1행의 합은 " + result2);
	}
}
