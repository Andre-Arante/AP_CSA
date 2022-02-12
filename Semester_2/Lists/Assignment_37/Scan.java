
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
      List<String> tumorGrid = t.getTumor();
      List<String> scanGrid = new ArrayList<String>();

      // Move through rows
      for (int anchorRow = 0; anchorRow < s.getScanLen()-t.getTumorLen()-1; anchorRow++)
      {
        // Move through columns
        for (int anchorCol = 0; anchorCol < s.getScanLen()-t.getTumorLen()-1; anchorCol++)
        {
          // Initalize counter for num of matches and scan portion
          int matches = 0;
          scanGrid = new ArrayList<String>();

          // Get tumorlen by tumorlen grid of the scan
          for (int i = 0; i < t.getTumorLen(); i++)
          {
            scanGrid.add(scan.get(i).substring(anchorCol, anchorCol + t.getTumorLen()));
          }

          // System.out.println("\nScan Tumor");

          for (int i = 0; i < scanGrid.size(); i++) 
          {
            
            // String msg = " not match";
            if (scanGrid.get(i).equals(tumorGrid.get(i)))
            {
              matches++;
              // msg = " match";
              // System.out.println("Matches " + matches);
              // System.out.println();
            }
            // System.out.println(scanGrid.get(i) + " " + tumorGrid.get(i) + msg);
          }   
          if (matches == t.getTumorLen()) 
          {
            return true;
          }  
        }
        scanGrid.clear();
      }
    return false; 
    }
  }


