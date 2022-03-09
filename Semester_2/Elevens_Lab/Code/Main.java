
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class Main {

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
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		
        /**
         * Create ElevensBoard instance
         */
        /* *** TO BE IMPLEMENTED IN ACTIVITY 8 *** */
        ElevensBoard board = new ElevensBoard(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);

        /**
         * Create CardGameGUI instance
         */
        CardGameGUI gui = new CardGameGUI(board);
		
        /**
         * Display the gui
         */
        gui.displayGame();
	}
}
