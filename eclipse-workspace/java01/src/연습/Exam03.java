package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// 입력
		String telecom = JOptionPane.showInputDialog("통신사 입력");
		String telNum = JOptionPane.showInputDialog("전화번호 입력");
		String name = JOptionPane.showInputDialog("가입자이름 입력");
		
		String connect_str = name + "님은 " + telecom + "에 " + telNum;
		
		JOptionPane.showMessageDialog(null, "다이얼로그로 " + connect_str + "로 가입되셨습니다." );
	}

}
