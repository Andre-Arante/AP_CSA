
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = true;


	/**
	 * Creates a new <code>ElevensBoard</code> instance, which is a subtype of Board.
	 */
	 public ElevensBoard(int size, String[] ranks, String[] suits, int[] pointValues) {
         /* *** TO BE IMPLEMENTED IN ACTIVITY 8 *** */
		 super(size, ranks, suits, pointValues);	
     }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		/* handles pair of non-face cards and group of three cards */
		return (this.containsPairSum11(selectedCards) || this.containsJQK(selectedCards));
	}

	/**
	 * Converts the string rank to index i of rank within RANKS arr
	 * @return index i of card in ranks
	 */
	public int find_idx(String rnk) 
	{
		for (int i = 0; i < RANKS.length; i++)
			{
				if (RANKS[i].equals(rnk)) { return i; }
			}
		return -1;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> dealt = new ArrayList<Integer>();
		for (int i = 0; i < super.size(); i++)
		{
			Card c = super.cardAt(i);
			dealt.add(find_idx((c.rank())));
		}
		return this.isLegal(dealt);	
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int total = 0;
		for (int i = 0; i < selectedCards.size(); i++)
		{
			/* make sure cards are non-face cards */
			int cardValue = POINT_VALUES[selectedCards.get(i)];
			if (cardValue >= 2 && cardValue <= 10) { total+=cardValue; } 
			/* check if values add up to 11 */
			if (total==11) { return true; }
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int passes = 0;

		for (int i = 0; i < selectedCards.size(); i++)
		{
			/* check for face cards */
			String rank = RANKS[selectedCards.get(i)];
			String faces = "acejackkingqueen";
			// System.out.println(selectedCards.get(i));
			if (faces.contains(rank)) { passes++; }
		}

		if (passes >= 3) { return true; }
		return false;
	}

public static void main(String[] args)
    {
        ElevensBoard b = new ElevensBoard(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
        System.out.println("Should be false: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(9, 10, 11))));
		System.out.println("Should be false: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(0))));
		System.out.println("Should be false: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(11, 5))));

		System.out.println("Should be true: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(1, 8))));
		System.out.println("Should be true: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(10, 11, 12))));
		System.out.println("Should be true: " + b.isLegal(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 0))));
    }
}