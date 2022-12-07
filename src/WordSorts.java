import java.util.*;
class WordSor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings");
        String s[] = new String[10];
        for(int i = 0;i<10;i++)
        s[i] = sc.nextLine();
        //Sorting
        for(int i=0;i<10-1;i++)
        {
            for(int j=0;j<10-i-1;i++)
            {
                if(s[j].compareTo(s[j+1]) > 0)
                {
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(s[i]+",");
        }
    }
}