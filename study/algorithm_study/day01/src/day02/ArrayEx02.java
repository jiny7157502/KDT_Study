package day02;

import java.util.Iterator;

public class ArrayEx02 {
	public static void main(String[] args) {
		//1. 2���� �迭�� ����� �ΰ� �й� �̸� �ֱ�
		String[][] s = new String[5][2];
		s[0][0] = "0397134";		
		s[0][1] = "��ȿ��";
		s[1][0] = "0465345";
		s[1][1] = "������";
		s[2][0] = "0427214";
		s[2][1] = "������";
		s[3][0] = "0487342";
		s[3][1] = "�迵��";
		s[4][0] = "0512478";
		s[4][1] = "�迹��";
		
		//2. �й��� ���ڷ� �����ϱ�
		int[] s1 = new int[5]; //�й��� ���ڷ� �����ؼ� ��� �� 1���� �迭
		for (int i = 0; i < s1.length; i++) {
			s1[i] = Integer.parseInt(s[i][0]);
		}
		
		//3. �й��� ���� ���� ���� ������� ã��
		//��ŷ ���ϴ� �˰���
		int[] s2 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			int cnt = 0;
			for (int j = 0; j < s1.length; j++) {
				if(s1[i] > s1[j]) {
					cnt++;
				}
			}
			s2[i] = cnt;
		}
		
		for (int ss2 : s2) {
			System.out.print(ss2 + " ");
		}
		
		//4. ��ŷ �迭�� �ִ� ���� �̿��ؼ� so[][] �迭�ȿ� �ִ´�.
		String[][] so = new String[5][2];
		for (int i = 0; i < s1.length; i++) {
			so[s2[i]][0] = String.valueOf(s1[i]);
			so[s2[i]][1] = s[i][1];
		}
		System.out.println();
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i][0] + " " + so[i][1]);
		}
	}
}
