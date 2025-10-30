package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */

	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String suits[] = {"Hearts","Clubs","Spades","Diamonds"};
		String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int pointValues[]= {11,2,3,4,5,6,7,8,9,10,10,10,10};
		Deck2 a = new Deck2(ranks,suits,pointValues);
		System.out.print(a);
	}
}
