import java.util.Scanner;
class Pronic
{
    int num;
    Pronic()
    {
        num = 0;
    }
    void acceptNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
    static boolean isPronic(int v)
    {
        int fact = 1, flag=0;
        for(int i=1;i<=v;i++)
        {
            fact = i * (i+1);
            if(fact == v)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1) return true;
        else return false;
    }
    void check()
    {
        if(isPronic(num)) System.out.println("It is a pronic.");
        else System.out.println("It is a not pronic.");
    }
    public static void main(String args[])
    {
        Pronic a = new Pronic();
        a.acceptNum();
        a.check();
    }
}