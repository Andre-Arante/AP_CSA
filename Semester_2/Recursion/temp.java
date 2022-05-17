public class temp 
{
    public static void mystery1(int x) 
    {
        System.out.println(x%10);
        if ((x/10)!=0)
        {
            mystery1(x/10);
        }
        System.out.println(x%10);
    }

    public static int mystery2(int n)
    {
        if (n==0) return 1;
        else return 3 * mystery2(n-1);
    }
    
    public static void main(String[] args)
    {
        System.out.println(mystery2(4));
    }
}
