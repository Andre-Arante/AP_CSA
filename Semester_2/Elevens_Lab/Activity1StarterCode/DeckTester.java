
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

    String[] ranks = {"Ace", "Queen", "Three"};
		String[] suits = {"Spades", "Hearts"};
		int[] pointValues = {11, 10, 3};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d);
		System.out.println(d.deal());
		System.out.println(d.deal());
		System.out.println(d);
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());
        System.out.println(d.deal());  // should print null
        System.out.println(d);
	}
}
