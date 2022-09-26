package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		String width = JOptionPane.showInputDialog("가로 길이를 입력하세요.");
		String height = JOptionPane.showInputDialog("세로 길이를 입력하세요.");
		
		int width2 = Integer.parseInt(width);
		int height2 = Integer.parseInt(height);
		
		int area = width2 * height2;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + area);
	}

}
