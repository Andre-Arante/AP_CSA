import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		List<Double> sides = new ArrayList<Double>();
		sides.add(3.0);
		sides.add(4.5);
		sides.add(5.5);
		sides.add(4.75);
		
		// Quadrilateral
		Polygon p = new Quadrilateral(sides, 0.5236 , 0.4363);
		System.out.println("\n" + p + "\n");
		
		// Rectangle
		sides = new ArrayList<>();
        sides.add(0, 6.5);
		sides.add(1, 6.5);
		sides.add(2, 3.0);
		sides.add(3, 3.0);
		Polygon p1 = new Rectangle(sides);
		System.out.println(p1 + "\n");
		
		// Square
        sides = new ArrayList<>();
		sides.add(0, 10.2);
		sides.add(1, 10.2);
		sides.add(2, 10.2);
		sides.add(3, 10.2);
		Polygon p2 = new Rectangle(sides);
		System.out.println(p2 + "\n");

        // Triangle
        sides = new ArrayList<>();
        sides.add(0, 6.5);
        sides.add(1, 4.0);
        sides.add(2, 3.0);
        Polygon t = new Triangle(sides);
        System.out.println(t + "\n");
	}
}
