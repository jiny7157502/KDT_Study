package day03;

public class 날짜계산하기1 {
	public static void main(String[] args) {
		DayOfYear dy = new DayOfYear();
		System.out.println("올해 1월 1일부터의 날짜는 " + dy.calc(2022, 2, 1));
	}
}

class DayOfYear {

	public int calc(int year, int month, int day) {
		int[] lastday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(isLeap(year)) lastday[2] = 29;
		int result = 0;
		for (int i = 1; i < month; i++) {
			result += lastday[i];
		}
		result += day;
		return result;
	}

	private boolean isLeap(int year) {
		if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return true;
		return false;
	}
	
}