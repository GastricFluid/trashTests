
public class PracClass {
	public void feedback(int score) {
		if (score == 300)
			System.out.println("You're p baddy");
		else if (score > 200)
			System.out.println("That's Horrible");
		else if (score > 10)
			System.out.println("That's Bad");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		PracClass tm = new PracClass();
		tm.feedback(60);
	}
}
