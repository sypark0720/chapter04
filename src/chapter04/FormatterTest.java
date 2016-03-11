package chapter04;

public class FormatterTest {

	public static void main(String[] args) {
		String name = "sunyoung";
		int score = 100;
		String s = 
				String.format("%s님의 점수는 %d입니다.", name, score);

	}

}
