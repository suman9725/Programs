import java.util.Scanner;
import java.util.StringTokenizer;
class ascisum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int sum = 0;
        StringTokenizer st = new StringTokenizer(s, " ");
        int count = st.countTokens();
        int ar[] = new int[count];
        String Strings[] = new String[count];
        for(int i=0;i<count-1;i++)
        {
            String w = st.nextToken();
            Strings[i] = w;
            char ch = w.charAt(i);
            sum = sum + (int)ch;
            ar[i] = sum; 
            System.out.println(Strings[i] +"\t"+ ar[i]);
        }
        /* for(int o = 0;o<ar.length;o++)
        {
            System.out.println(ar[o]);
        } */
    }
}