
/**
 * Finds the equation of a line, a point on the line, and the perpindicular equivilant
 *
 * @andre arante (your name)
 * @9.24.21 (a version number or a date)
 */

import java.util.Scanner;

public class main
{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // take user input
        System.out.println("Enter the first point: ");
        System.out.print("x: ");
        double X1 = input.nextDouble();
        System.out.print("y: ");
        double Y1 = input.nextDouble();
        
        System.out.println("Enter the second point: ");
        System.out.print("x: ");
        double X2 = input.nextDouble();
        System.out.print("y: ");
        double Y2 = input.nextDouble();
 
        // create Line object and call perpendicular line method
        Line firstLine = new Line(X1, Y1, X2, Y2);
        
        firstLine.slopeInterceptForm();
        
        // firstLine.solveForY(inputX);
               
        System.out.println("Solve for y. Please input x:");
        double inputX = input.nextDouble();
        
        firstLine.solveForY(inputX);
        firstLine.printY();
        
        System.out.println("Enter a coordinate: ");
        System.out.print("x: ");
        double pX = input.nextDouble();
        System.out.print("y: ");
        double pY = input.nextDouble();
        
        firstLine.perpindicularLine(pX, pY);
    }
}
