import java.util.*;
class XylemPholem
{
    static boolean xylem(int n)
    {
        String a = Integer.toString(n);
        int len = a.length();
        char fl = a.charAt(0);
        char ll = a.charAt(len-1);
        int ae = Character.getNumericValue(fl);
        int b = Character.getNumericValue(ll);
        int u=0,sum1 = 0;
        int sum = ae+b;
        for(int i=1;i<a.length()-1;i++)
        {
            char ch = a.charAt(i);
            u=Character.getNumericValue(ch);
            sum1 = sum1 + u;
        }
        System.out.println("Number of mean digits: "+sum1+"\nSum of extreme Digits: "+sum);
        if(sum == sum1) return true;
        else return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(xylem(n))
        {
            System.out.println(n + "Is a xylem number");
        }
        else
        {
            System.out.println(n + "Is a pholem number");
        }
    }
}
