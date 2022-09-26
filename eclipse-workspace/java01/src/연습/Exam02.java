package 연습;

public class Exam02 {

	public static void main(String[] args) {
		String height = "199.9";
		Double height2 = Double.parseDouble(height);
		Double weight = (height2 - 100) * 0.9;
		System.out.println("키 199.9일 때 적정 몸무게는 " + weight);
	}

}
