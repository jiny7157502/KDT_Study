package day02;

public class IdTester119 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		a.getId();
		b.getId();
	}
	
}

class Id {
	private static int counter = 0;
	private int id;
	
	public Id() {
		id = ++counter;
		System.out.println("������ �κ���");
	}
	public static int getCounter() {
		return counter;
	}
	public int getId() {
		return id;
	}
	{
		System.out.println("��� �κ���");
	}
	static {
		System.out.println("�̰��� ���� �����");
	}
}