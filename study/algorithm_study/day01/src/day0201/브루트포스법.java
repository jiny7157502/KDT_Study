package day0201;

public class ���Ʈ������ {
	public static void main(String[] args) {
		String s1 = "ABC������DEF";
		String s2 = "������";
		int idx = bfMatch(s1, s2);
		if (idx == -1) {
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		} else {
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += s1.substring(i, i+1).getBytes().length;
			}
			len += s2.length();
			System.out.println((idx + 1) + "��° ���ں��� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len), s2);
		}
	}
	
	private static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		System.out.println(txt.length() + " " + pat.length());
		while( pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length()) {
			return pt - pp;
		}
		return 0;
	}
}
