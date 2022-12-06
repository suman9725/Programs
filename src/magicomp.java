import java.util.*;
class magiccomp{
    static boolean comp(int n)
    {
        int count=0;
        for(int i = 1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count > 2)
            return true;
        else return false;
    }

    static boolean magic(int n)
    {
        int sum=0;
        int p=n; // p = 28
        while(p>9)
        {
            sum=0;
            while(p>0){
                sum = sum + (p%10);//10
                p = p/10;
            }
            p = sum;
        }
        if(sum == 1) return true;
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value:");
        int m = sc.nextInt();
        System.out.println("Enter the starting value:");
        int n = sc.nextInt();
        int c=0;
        String t = "";
        for(int i=m;i<=n;i++)
        {           
            if(comp(i)&&magic(i))
            {
                c++;
                t = t + i + ",";
            }
        }
        System.out.println(t.substring(0,t.length()-1));
        System.out.println("Frequency:"+c);
    }
}