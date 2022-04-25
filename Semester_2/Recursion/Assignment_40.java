public class Assignment_40 
{
    public static void main(String[] args)
    {
        // System.out.println(sumDigits(126));
        // System.out.println(sumDigits(49));
        // System.out.println(sumDigits(3));

        // System.out.println(triangle(0));
        // System.out.println(triangle(1));
        // System.out.println(triangle(2));
        // System.out.println(triangle(5));

        // System.out.println(changePi("xpix"));
        // System.out.println(changePi("pipi"));
        // System.out.println(changePi("pip"));

        System.out.println(fibonacci(0));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(6));
    }

    public static int sumDigits(int num)
    {
        if (num%10==0) return 0;
        return num%10+sumDigits(num/10); 
    }

    public static int triangle(int rows)
    {
        if (rows==0) return 0;
        return rows+triangle(rows-1);
    }

    public static String changePi(String s)
    {
        int idx = s.toLowerCase().indexOf("pi");
        if (idx == -1) return s;
        else
        {
            return changePi(s.substring(0, idx) + "3.14" + s.substring(idx+2));
        }
    }

    public static int fibonacci(int f)
    {
        if (f == 0) return 0;
        else if (f==1) return 1;
        else 
        {
            return fibonacci(f-1)+fibonacci(f-2);
        }
    }

}