
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // take user input
        System.out.println("Enter the first point: ");
        System.out.print("x: ");
        double X1 = input.nextDouble();
        System.out.println("y: ");
        double Y1 = input.nextDouble();
        
        System.out.println("Enter the second point: ");
        System.out.print("x: ");
        double X2 = input.nextDouble();
        System.out.println("y: ");
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
        System.out.println("x: ");
        double pX = input.nextDouble();
        System.out.println("y: ");
        double pY = input.nextDouble();
        
        firstLine.perpindicularLine(pX, pY);
    }
}
