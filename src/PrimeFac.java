import java.util.Scanner;
public class PrimeFac 
{
    int num[];
    int freq[];
    PrimeFac()
    {
        freq = new int[10];
        num = new int[10];
        for(int i = 0;i<10;i++)
        {
            freq[i] = 0;
            num[i] = 0;
        }
    }
    void enter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for(int i=0;i<10;i++)
        {
            num[i] = sc.nextInt();
        }
    }
    int isprime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2) return 1;
        else    return 0;
    }
    void freqfac()
    {
        for(int i = 0;i<10;i++)
        {
            freq[i] = 0;
            for(int j = 2;j<10;j++)
            {
                if(num[i]%j==0&&isprime(j)==1)
                freq[i] += 1;
            }
        }
    }
    void display()
    {
        System.out.println("Enter the numbers: ");
        for(int i = 0;i<10;i++)
        System.out.println(freq[i]+ "\t");
    }
    public static void main(String[] args) {
        PrimeFac ob = new PrimeFac();
        ob.enter();
        ob.freqfac();
        ob.display();
    }
}
