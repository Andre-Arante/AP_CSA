import java.util.List;
import java.util.ArrayList;

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
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
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
	// @Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
        return findPairSum11(selectedCards).size() != 0 || findJQK(selectedCards).size() != 0;
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
	// @Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
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
	 * Look for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return a list of the indexes of an 11-pair, if an 11-pair was found;
	 *         an empty list, if an 11-pair was not found.
	 */
	private List<Integer> findPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		System.out.println();

		for (Integer i : selectedCards)
		{
			System.out.println(i);
		}

		for (int i = 0; i < selectedCards.size()-1; i++)
		{
			for (int j = i+1; j < selectedCards.size(); j++)
			{
				System.out.println("Card i : " + selectedCards.get(i) + " with point value: " + POINT_VALUES[selectedCards.get(i)]);
				System.out.println("Card j: " + selectedCards.get(j) + " with point value: " +  POINT_VALUES[selectedCards.get(j)]);
				if (POINT_VALUES[selectedCards.get(i)] + POINT_VALUES[selectedCards.get(j)] == 11) return true;
			}
		}
		return false;	}

	/**
	 * Look for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return a list of the indexes of a JQK, if a JQK was found;
	 *         an empty list, if a JQK was not found.
	 */
	private List<Integer> findJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int passes = 0;

		for (int i = 0; i < selectedCards.size(); i++)
		{
			/* check for face cards */
			String rank = RANKS[selectedCards.get(i)].toLowerCase();
			String faces = "jackkingqueen";
			// System.out.println(selectedCards.get(i));
			if (faces.contains(rank)) 
			{ 
				passes++; 
				// check face off as found
				faces = faces.substring(0, faces.indexOf(rank))+faces.substring(faces.indexOf(rank)+rank.length(), faces.length());
			}	

		if (passes >= 3) { return true; }
		}
		return false;
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		return playJQKIfPossible() || playPairSum11IfPossible();
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 11.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 11-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum11IfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		if (this.playPairSum11IfPossible(selectedCards).size() == 0) return false;

		for (int i = 0; i < this.findPairSum11(selectedCards); i++)
		{
			this.deal(findPairSum11(selectedCards).get(i));
		}

		return true;

	}

	/**
	 * Looks for a group of three face cards JQK.
	 * If found, replace them with the next three cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a JQK play was found (and made); false othewise.
	 */
	private boolean playJQKIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		if (this.findJQK(selectedCards).size() == 0) return false;
		for (int i = 0; i < this.findJQK(selectedCards); i++)
		{
			this.deal(this.findJQK(selectedCards).get(i));
		}
		return true;
		
	}
}
