package day02;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch121 {
	public static void main(String[] args) {
		Scanner stdId = new Scanner(System.in);
	
		String[] x = { "boolean", 	"byte", "char", "double", "floatint",
		      "long","short"  };
		System.out.println("ã�� ���� ���ڴ�?");
		String key = stdId.next();
		
		int idx = Arrays.binarySearch(x, key);
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
		double[] x1 = {12.2, 23.4, 55.7};
		System.out.println("ã�� ���� �Ǽ���?");
		double x1key = stdId.nextDouble();
		
		idx = Arrays.binarySearch(x1, x1key);
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
	}
}
