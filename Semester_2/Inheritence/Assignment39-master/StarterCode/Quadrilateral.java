/**
 * Quadrilateral class
 * 
 * A Quadrilateral is a Polygon
 * 
 * The class contains two instance variables for the opposite angles (in radians).
 * It also contains a constructor and overrides the getArea() method from the superclass.
 * 
 * @author
 * @version
 */

import java.util.List;

public class Quadrilateral extends Polygon
{

    double ah, ey;

    public Quadrilateral(List<Double> sides, double ah, double ey)
    {
        super(sides);
        this.ah = ah;
        this.ey = ey;
    }

    public double getArea()
    {
        double s = this.getPerimeter()/2;
        double a = this.getSides().get(0);
        double b = this.getSides().get(1);
        double c = this.getSides().get(2);
        double d = this.getSides().get(3);

        return Math.sqrt((s-a)*(s-b)*(s-c)*(s-d)-1/2*a*b*c*d*(Math.cos((ah+ey)/2)*Math.cos((ah+ey)/2)));
    }


}

