
public class PracClass {
	public void feedback(int score) {
<<<<<<< HEAD
		if (score == 300)
			System.out.println("You're p baddy");
		else if (score > 200)
			System.out.println("That's Horrible");
=======
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 20)
			System.out.println("That's great");
>>>>>>> homerprac
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
