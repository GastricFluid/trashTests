
public class PracClass {
	public void feedback(int score) {
		if (score == 200)
			System.out.println("You're awesome");
		else if (score > 140)
			System.out.println("That's great");
		else if (score > 10)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		PracClass tm = new PracClass();
		tm.feedback(60);
	}
}
