import java.util.*;
class circularprime
{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i = 1; i<=n;i++)
        {
            if(n%i == 0)
                c++;
        }
        if(c==2)
            {
                c=0;
                return true;
            }
            else
            {
                return false;
            }
    }

    public static boolean isCircular(int a)
    {
        String u = "" + a;
        int l = u.length();
        int x= a;
        int lnum,fnum;
        while(isPrime(a))
        {
            lnum = a%10; // 131 | 1
            fnum = a/10;
            a = (int)(Math.pow(10,l-1)*lnum)+fnum;
            if(a==x)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(isCircular(n))
        {
            System.out.println("Number is Circular");
        }
        else
        {
            System.out.println("Not a circular");
        }
    }
}
