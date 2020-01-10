
public class Question extends MCQQuestion {
	String question;
	String[] topics;
	int difficult;
	String answer;

	public Question(String question, String[] topics, int difficult) {
		this.question = question;
		this.topics = topics;
		this.difficult = difficult;
	}
}
