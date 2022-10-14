package day01;

public class Q12 {
	public static void main(String[] args) {
		double a = 10.0;
		double b = 13.0;
		double c = 12.0;
		
		double x1, x2;
		x1 = -b + Math.sqrt(Math.abs(b*b-4*a*c)) / 2*a;
		x2 = -b - Math.sqrt(Math.abs(b*b-4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
