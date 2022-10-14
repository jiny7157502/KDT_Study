package day01;

public class ArrayEx01 {
	public static void main(String[] args) {
//		int[] aa = new int[10];
//		String[][] b = new String[2][3];
//		b[0][0] = "a";
//		b[0][1] = "b";
//		b[0][2] = "c";
//		b[1][0] = "d";
//		b[1][1] = "e";
//		b[1][2] = "f";
//		
//		double[][][] c = new double[2][3][2];

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (i+1) * 100;
		}
		for (int i : num) {
			System.out.print(i);
			System.out.print(" ");
		}
	
	}
}
