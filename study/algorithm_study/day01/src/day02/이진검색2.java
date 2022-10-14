package day02;

public class 이진검색2 {
	public static void main(String[] args) {
		int[] a = {5, 7, 15, 28, 29, 31, 39, 58, 68, 70, 95};
		int key = 39;
		int idx = 이진검색메소드(a, a.length, key);
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

	private static int 이진검색메소드(int[] a, int length, int key) {
		// 변수선언
		int p1 = 0;
		int pr = length;
		
		for (int i = 0; p1 <= pr; i++) {
			
		}
		
		do {
			int pm = (p1 + pr) / 2;
			if(a[pm] == key) {
				return pm;
			} else if(a[pm] > key) {
				pr = pm - 1;
			} else if(a[pm] < key) {
				p1 = pm + 1;
			}
		} while(p1 <= pr);
		return -1;
		

	}
}
