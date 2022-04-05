
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class Main {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		
        /**
         * Create ElevensBoard instance
         */
        /* *** TO BE IMPLEMENTED IN ACTIVITY 8 *** */
        ElevensBoard board = new ElevensBoard();

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
