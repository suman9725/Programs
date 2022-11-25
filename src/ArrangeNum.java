import java.util.Scanner;
class ArrangeNum
{
    int N;
    int s[];
    ArrangeNum()
    {
        N=0;
    }
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");        
        N = sc.nextInt();
        String a = "" + N;
        int len = a.length();
        s = new int[len];
    }
    void fill_Array()
    {
        String a = Integer.toString(N);
        int len  = a.length();


        //For loop to insert the numbers
        for(int i=0;i<len;i++)
        {
            char ch = a.charAt(i);
            int b = Character.getNumericValue(ch);
            s[i] = b;
        }
        System.out.println("Array:");
        for(int i=0;i<len;i++)
        System.out.print(s[i]+"");
    }
    void arrange()
    {
        
        String a = Integer.toString(N);
        int len = a.length();// 5 4 6 7 2
        for(int i=0; i < len-1;i++)
        {
            for(int j=0; j < len-i-1;j++)
            {
                if(s[j]>s[j+1])
                {
                    int t=s[j];
                    s[j] = s[j+1];
                    s[j+1] = t; 
                }
            }
        }
        System.out.println("\nHoho:");  
        for(int i=0; i < len;i++)
        System.out.print(s[i]+"");  
    }
    public static void main(String args[]) 
    {
        ArrangeNum ob = new ArrangeNum();
        ob.read();
        ob.fill_Array();
        ob.arrange();
    }
}