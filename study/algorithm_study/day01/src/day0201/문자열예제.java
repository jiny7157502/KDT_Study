package day0201;

public class ���ڿ����� {
	public static void main(String[] args) {
		String s = "abcdefg";
		System.out.println("���ڿ� ���� " + s.length());
		System.out.println("���ڿ� ���� " + s.getBytes().length);
		System.out.println("���ڿ� �ȿ� Ư�� ���ڸ� ������ �޼ҵ� " + s.charAt(1));
		System.out.println("�κ� ���ڿ��� ������ �޼ҵ� subString " + s.substring(3));
		System.out.println("�κ� ���ڿ��� ������ �޼ҵ� subString " + s.substring(2, 4));
		System.out.println("�ٸ� ���ڿ��� ������ ������ �����ϴ� �޼ҵ� " + s.equals("abc"));
		System.out.println("�ٸ� ���ڿ��� ���ϴ� �޼ҵ� " + s.compareTo("abcdefg"));
		System.out.println("���ڿ��� �˻��ϱ� " + s.indexOf("c"));
		System.out.println("���ڿ��� �˻��ϱ� " + s.lastIndexOf("c"));
	}
}
