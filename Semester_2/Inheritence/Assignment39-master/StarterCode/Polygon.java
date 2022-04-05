import java.util.List;
import java.util.ArrayList;

import java.text.DecimalFormat;
import java.math.RoundingMode;


public class Polygon 
{
	private List<Double> sides;
	
	/**
	 * 
	 * @param sides of polygon
	 */
	public Polygon(List<Double> sides)
	{
		this.sides = new ArrayList<Double>(sides);
	}
	
	/**
	 * name: getPerimeter
	 * return type: double
	 * @return perimeter of this Polygon
	 */
	public double getPerimeter()
	{
		double s = 0;
		for (double side : this.getSides()) {
			s += side;
		}
		return s;
	}
	
	
	
	
	
		
	/**
	 * name: getNumVertices
	 * return type: int
	 * @return number of vertices (corners) this Polygon has
	 */
	public int getNumVertices() 
	{
		return this.getNumSides();
	}
	
	
	
	
	
	/**
	 * name: getNumSides
	 * return type: int
	 * @return number of sides this Polygon has
	 */
	public int getNumSides() 
	{
		return this.getSides().size();
	}
	
	
	
	
	
	
	/**
	 * name: getSumOfAngles
	 * return type: int
	 * @return sum of all angles ( (num_sides - 2) * 180)
	 */
	public int getSumOfAngles()
	{
		return (this.getNumSides() - 2) * 180;
	}
	
	



	
	/* *** DO NOT EDIT BELOW HERE *** */

	/**
	 * name: getArea
	 * return type: double
	 * @return 0.0 (this a placeholder method that gets overriden in subclasses; would be better as an abstract method)
	 */
	public double getArea()
	{
		return 0.0;
	}
	
	/**
	 * 
	 * @return copy of sides array
	 */
	public List<Double> getSides()
	{
		return new ArrayList<Double>(sides);
	}
	
	/**
	 * Override toString method in Object class.
	 */
	@Override
	public String toString()
	{
		String str = "";
		List<Double> s = getSides();
		
		if(getNumSides() == 3)
			str += "Triangle";
		
		else if(getNumSides() == 4 && s.get(0).equals(s.get(1)) && s.get(0).equals(s.get(2)) && s.get(0).equals(s.get(3)))
			str += "Square";
		
		else if(getNumSides() == 4 && s.get(0).equals(s.get(1)) && s.get(2).equals(s.get(3)))
			str += "Rectangle";
		
		else if(getNumSides() == 4)
			str += "Quadrilateral";
		
		else
			str += "Polygon";
		
		double area = getArea();
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		str += "\nArea = " + df.format(area) + "\nPerimeter = " + getPerimeter() +
				"\nNumber of sides: " + getNumSides() + "\nSum of angles: " + getSumOfAngles();
		
		return str;
	}
}
