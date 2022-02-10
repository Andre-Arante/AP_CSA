
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
        Tumor rotated;

        // Check if match 4 times: one for each 90 degree rotation
        for (int d = 0; d < 360; d+=90) 
        {
            
            rotated = t.rotate(d);
            
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
        List<String> scan = s.getScan();
        List<String> tumor = t.getTumor();
        
         // Iterate through s and t simultaneously
         for (int anchorRow = 0; anchorRow < scan.size()-3; anchorRow++)
         {
            // Move through current column of the anchor
             for (int anchorCol = 0; anchorCol < scan.get(anchorRow).length()-3; anchorCol++)
             {
                 // Initalize counter for num of matches
                int matches = 0;
                List<String> scanGrid = new ArrayList<String>();
                List<String> tumorGrid = new ArrayList<String>();

                // Get 4 by 4 grid of the scan
                for (int i = 0; i < 4; i++)
                {
                  tumorGrid.add(tumor.get(anchorRow).substring(anchorCol, anchorCol+4));
                  scanGrid.add(scan.get(anchorRow).substring(anchorCol, anchorCol+4));
                }

                for (String str : scanGrid) 
                {
                  System.out.println(str);
                }

                for (String foo : tumorGrid) 
                {
                  System.out.println(foo);
                }
             }
         }
         // Return false if all were matches and function has still not returned
         return false;
     }
    
}
