import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String s1 = "what is 1+1? \n" + "(a)1\n(b)2\n(c)3\n(d)4\n";
		String s2 = "what is 1+4? \n" + "(a)5\n(b)2\n(c)3\n(d)4\n";
		String s3 = "what is 2+1? \n" + "(a)1\n(b)2\n(c)3\n(d)4\n";
		String s4 = "what is 1+3? \n" + "(a)5\n(b)2\n(c)3\n(d)4\n";
		Question[] questions = { new Question(s1, "b"), new Question(s2, "a"), new Question(s3, "c"),
				new Question(s4, "d") };
		takeTest(questions);

	}

	public static void takeTest(Question[] questions) {
		Scanner keyboardInput = new Scanner(System.in);
		int score = 0;
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if (answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("Your total score : " + score + "/" + questions.length);
	}
}
