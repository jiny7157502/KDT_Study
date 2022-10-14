package day02;

public class 선형검색예제1 {
	public static void main(String[] args) {
		//그림 3-2
		//배열안에 값을 넣기
		int[] a = {6, 4, 3, 2, 1, 2, 8};
		int key = 2; // 검색할 키값
		
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				System.out.println("찾음");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("못참음");
		}
	}
}
