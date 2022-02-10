
/**
 * No changes need to be made in this class.
 *
 * @author King
 * @version 
 */
public class Main
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 4; i++)
        {
            String file = "scan" + i + ".txt";
            Initialize init = new Initialize(file);
            Scan s = new Scan(init.getScan());
            Tumor t = new Tumor(init.getTumor());

            System.out.print(s.getTumorLoc(t) + "\n\n");
        }
    }
}
