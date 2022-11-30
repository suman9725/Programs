import java.util.Arrays;
import java.util.*;
public class Fascinating
{
    static String three(int n)
    {
        int a = n*1;
        int b = n*2;
        int c = n*3;
        String s = a+""+b+""+c;
        return s;
    }

    static String sortnum(String s)
    {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        int n = sc.nextInt();
        String y = three(n);
        String sorted = sortnum(y);
        if(sorted.equals("123456789"))
        {
            System.out.println("Fascinating number.");
        }
        else
        {
            System.out.println("Not a fascinating number.");
        }
    }
}