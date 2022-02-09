
import java.util.List;
import java.util.ArrayList;

/**
 * A scan that possibly contains tumors. 
 * 
 * @author  
 * @version
 */

public class Scan 
{
    // private class variable List that holds the rows as Strings
    private List<String> rows;

    // tumor location
    private int x, y;
    

    /** 
     * constructor
     * @param List<String> rows
     * initialize class variable as an ArrayList
     */
    public Scan(List<String> rows) 
    {
        this.rows = new ArrayList<String>(rows);
    } 
    
    
    

    /** 
     * method: getScan
     * @param none
     * @return a copy of the scan (List<String>)
     */
    public List<String> getScan()
    {
        return new ArrayList<String>(rows);
    }

    
    
    
    
    
    /**
     *  method: getScanLen
     *  @param none
     * @return the length of List class variable (number of rows)
     */
    public int getScanLen() 
    {
        return rows.size();
    }

    
    
    

    /** 
     * method: getTumorLoc
     * @param Tumor t
     * @return String that says where the tumor is (with rotation) or "No tumors detected." if not found.
     */
    public String getTumorLoc(Tumor t) 
    {
        // Initalize result
        String result = "No tumors detected";

        // Check if match 4 times: one for each 90 degree rotation
        for (int d = 0; d < 360; d+=90) 
        {
            Tumor rotated = t.rotate(d);
            
            if (this.isMatch(new Scan(getScan()), rotated))
            {
                result = new String("Possible tumor at (" + this.x + ", " + this.y + ", " + d + ")"); 
            }
        }

        return result;
    }
    
    
    

    
    /**
     * method: isMatch
     * @param Scan s, Tumor t
     * @return true if all corresponding rows from the Scan and Tumor match, false otherwise.
     */
     public boolean isMatch(Scan s, Tumor t) 
     {
         // Iterate through s and t simultaneously, break instantly if a mismatch is found
         for (int anchorRow = 0; anchorRow < s.getScanLen()-4; anchorRow++)
         {
            // Move through current column of the anchor
             for (int anchorCol = 0; anchorCol < s.getScan().get(anchorRow).length()-4; anchorCol++) 
             {
                 // Initalize counter for num of matches
                int matches = 0;

                 // Move through a 4 by 4 grid vertically (row by row)
                 for (int gridRow = 0; gridRow < 4; gridRow++) 
                 {
                    
                     // Fetch current row
                    String tempScan = s.getScan().get(gridRow);
                    String tempTumor = t.getTumor().get(gridRow);

                     for (int gridCol = 0; gridCol < 4; gridCol++) 
                     {
                        int idx = anchorCol + gridCol;

                        // Check if corresponding scan idx equals corresponding tumor index
                        if (tempTumor.substring(idx, idx+1).equals(tempScan.substring(idx, idx+1)))
                        {
                            matches++;
                        }
                     }
                     // If all squares in 4 by 4 grid were matches, tumor is found
                     if (matches == 16)
                     {
                         this.y = anchorRow;
                         this.x = anchorCol;
                        return true;
                     } 
                 }
             }
         }

         // Return false if all were matches and function has still not returned
         return false;
     }
    
}
