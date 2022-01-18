
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int y = input.nextInt();
        //divide y by 19 and find remainder
        int a = y % 19;
        //divide y by 100
        int b = y / 100;
        int c = y % 100;
        //divide b by 4
        int d = b / 4;
        int e = b % 4;
        //divide b + 8 by 25
        int f = (b + 8) / 25;
        //divide b - f + 1 / 3
        int g = (b - f + 1) / 3;
        //divide 19 * a + b - d - g + 15 / 30
        int h = (19 * a + b - d - g + 15) % 30;
        //divide c by 4
        int i = c / 4;
        int k = c % 4;
        //divide 32 + 2 * e + 2 * i - h - k / 7
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        //divide a + 11 * h + 22 * r / 451
        int m = (a + 11 * h + 22 * r) / 451;
        //divide h + r - 7 * m + 114 / 31
        int n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;
        int year = p + 1;
        
        //print results
        System.out.println("In the year " + y + " Easter will be on " + n + "/" + year);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        System.out.println("i = " + i);
        System.out.println("k = " + k);
        System.out.println("r = " + r);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("p = " + p);
    }
}
