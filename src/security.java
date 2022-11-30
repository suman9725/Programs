import java.util.*;
public class security 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String a = sc.next();
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int l = a.length();
        if(n>6)
        {
            System.out.println("Error, Length of the string should not be more than 6");
            return;
        }
        else if(n!=l)
        {
            System.out.println("String and number mismatch.");
            return;
        }
        int indicator;
        for(int i=0;i<l;i++)
        {
            char ch = a.charAt(i);
            if(!Character.isUpperCase(a.charAt(i)))// S O U N A K
            {
                System.out.println("Not Upper Case.");
                return;
            }
            else if(a.charAt(i) == a.charAt(i+1))
                {
                    System.out.println("Repeated");
                    return;
                }
        }
    }
    
}
