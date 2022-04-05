import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class Main 
{
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    public static void main(String[] args)
    {
        System.out.println(containsPairSum11(new ArrayList(
			Arrays.asList(0, 9)
		)));
    }

	public static boolean faceValue(List<Integer> selectedCards, int i) {
		return POINT_VALUES[selectedCards.get(i)] >= 2 && POINT_VALUES[selectedCards.get(i)] <= 10;
	}

    public static boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int total = 0;
		for (int i = 0; i < selectedCards.size(); i++)
		{

			/* make sure cards are non-face cards */
			if(faceValue(selectedCards, i)) total+=POINT_VALUES[selectedCards.get(i)]; 
			/* check if values add up to 11 */
			System.out.println(selectedCards.get(i) + ": " + POINT_VALUES[selectedCards.get(i)]);
			// check against every other selected card
			
			for (int j = 0; j < selectedCards.size(); j++)
			{
				if(faceValue(selectedCards, j)) total+=POINT_VALUES[selectedCards.get(j)]; 
				if (total==11) {  return true; }
				else total = POINT_VALUES[selectedCards.get(i)]; 
			}
		}
		return false;
	}
}