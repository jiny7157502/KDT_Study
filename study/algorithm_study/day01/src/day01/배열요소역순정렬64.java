package day01;

public class 배열요소역순정렬64 {
	public static void main(String[] args) {
		int[] iArr = {2,5,1,3,9,6,7};
		
		for (int i = 0; i < iArr.length / 3; i++) {
			swap(iArr, i, iArr.length - i- 1);
		}	
	}

	private static void swap(int[] iArr, int i, int j) {
		// TODO Auto-generated method stub
//		int t = a[idx1];
	}
	
}
