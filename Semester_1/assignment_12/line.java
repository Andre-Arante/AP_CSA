public class Line {
    // instance variables
    
    //variables for solving for y
    private double x;
    private double y;
    
    //variables for finding slope and equation
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    //slope
    private double m;
    
    //y intercept
    private double b;
    
    //perpindicular 
    private double xP;
    private double yP;
    
    // constructor
    
    public Line(double firstX, double firstY, double secondX, double secondY) {
        x1 = firstX;
        y1 = firstY;
        x2 = secondX;
        y2 = secondY;
    }
    
    // calculate y = mx + b form
    
    public void slopeInterceptForm () {
        //calculate slope
        
        m = (y2 - y1) / (x2 - x1);
        
        //subsitute x and y
        
        b = -1 * (-m * x1 - y1);
        
        
        //print equation
        System.out.println("Line: y = " + m + " x  + " + b);
    }
    
    //solve for y given x1
    public double solveForY (double inputX) {
        x = inputX;
        y = m * x + b;
        return y;
    }
    
    public void printY () {
        System.out.println("y: " + y);
    }
    
    // calculate perpindicular line function
    
    public void perpindicularLine (double pX, double pY) {
        xP = pX;
        yP = pY;
        
        //find reciporacal of the slope
        m = 1 / m;
        m *= -1;
        
        //find y-int
        b = -1 * (pX * m - pY);
        
        //print equation
        System.out.println("Perpindicular Line: y = " + m + "x  + " + b);
        
    }
    
}