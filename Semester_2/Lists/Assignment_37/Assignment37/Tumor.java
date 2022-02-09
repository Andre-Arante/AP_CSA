import java.util.List;
import java.util.ArrayList;

/**
 * Represents a tumor to be found in a scan.
 *
 * @author
 * @version
 */
public class Tumor
{
    // private class variable List that holds the rows as Strings
    private List<String> rows;
    

    /** 
     * constructor
     * @param List<String> 
     * initialize class variable as an ArrayList
     */
    public Tumor(List<String> rows)
    {
        //this.rows = rows;
        this.rows = new ArrayList<String>(rows);
    }
    
    /** 
     * method: getTumor
     * @param none
     * @return a copy of the tumor (List<String>)
     */
    public List<String> getTumor()
    {
        // return a copy instead of a reference to the original object.
        return new ArrayList<String>(rows);
    }
    
    /** 
     * method: getTumorLen
     * @param none
     * @return the length of List class variable (number of rows)
     */
    public int getTumorLen()
    {
        return rows.size();
    }

    /**
     * method: rotate
     * @param int (pre: degrees that is a multiple of 90)
     * @return A Tumor object that has been rotated d degrees counterclockwise.
     * Note: does NOT do a full rewrite of the rotate90 code and uses the existing rotate90 method.
     */
    public Tumor rotate(int d) 
    {
        // Generate copy of tumor
        Tumor temp = new Tumor(this.getTumor());

        for (int i = 0; i < d/90; i++)
        {
            temp = rotate90(temp);
        }

        return temp;
    }
    
    
    
	
	

    /** 
     * method: rotate90
     * @param: Tumor that is to be rotated.
     * @return: a copy of Tumor t that is rotated 90 degrees counterclockwise.
     */
    public Tumor rotate90(Tumor t)
    {
        List<String> rotated = new ArrayList<String>();
        int dimension = t.getTumorLen();
        for(int i = 0; i < dimension; i++)
        {
            rotated.add("");
        }
        
        for(int row = 0; row < dimension; row++)
        {
            for(int col = 0; col < dimension; col++)
            {
                String origRow = t.getTumor().get(col);
                String digit = origRow.substring(dimension - 1 - row, dimension - 1 - row + 1);
                
                // shorthand
                //String digit = t.getTumor().get(col).substring(dimension - 1 - row, dimension - 1 - row + 1);
                
                rotated.set(row, rotated.get(row) + digit);
            }
        }
        
        Tumor tumor = new Tumor(rotated);
        return tumor;
        
        // shorthand
        //return (new Tumor(rotated));
    }
}
