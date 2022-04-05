/**
 * Rectangle class
 * 
 * A Rectangle is a Qudrilateral
 * 
 * This class contains a single constructor and no class methods.
 * 
 * @author
 * @version
 */ 

import java.util.List;

public class Rectangle extends Polygon
{
    public Rectangle(List<Double> sides)
    {
        super(sides);
    }

    public double getArea()
    {
        return this.getSides().get(0)*this.getSides().get(3);
    }
}
