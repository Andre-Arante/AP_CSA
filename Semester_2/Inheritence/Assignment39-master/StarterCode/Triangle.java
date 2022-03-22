
/*
 * Triangle class
 * 
 * A Triangle is a Polygon
 * 
 * The class contains a constructor and overrides the getArea() method from the superclass.
 */

import java.util.List;

public class Triangle extends Polygon
{
    public Triangle(List<Double> sides)
    {
        super(sides);
    }
	
    public double getArea()
    {
        double s = 0;
        for (double side : this.getSides()) { s += side; }
        double a = this.getSides().get(0);
        double b = this.getSides().get(1);
        double c = this.getSides().get(2);

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
	
}
