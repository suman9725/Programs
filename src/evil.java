import java.util.*;
public class evil 
{
static boolean check(int n)
{
    if(n>2&&n<100) return true;
    else return false;
}
static int binary(int a)
{
    String s="";
    int n=a;
    while(n>0) //2
    {
        int d = n%2; //d=0
        s = d + s;//00
        n = n/2; // 2
    }
    int y = Integer.parseInt(s);
    return y;
}
static boolean isevil(int q)
{
    int c=0;
    int y = binary(q);
    String s = Integer.toString(y);
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);
        
        if(ch == '1')
        c++;
    }
    if(c%2 == 0)
    {
        return true;
    }
    else return false;
}
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    System.out.println("Binary Equivalent:"+binary(num));
    if(isevil(num))
    System.out.println("number is evil");
    else
     System.out.println("not a evil");
    
}
}