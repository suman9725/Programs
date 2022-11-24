import java.util.*;
class SwapSort
{
    String wrd;
    int len;
    String swapwrd;
    String sortWrd;
    SwapSort()
    {
        len = 0;
        wrd = "";
        swapwrd = "";
        sortWrd = "";
    }
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        wrd = sc.nextLine();
        wrd.toUpperCase();
    }
    void swapChar()
    {
        String ar[] = new String[wrd.length()];
        String a="";
        for(int i=0;i<wrd.length();i++)// SOUNAK
        {
            char ch = wrd.charAt(i);
            String u = String.valueOf(ch);
            ar[i] = u;
        }
        String first = "";
        String last = "";
        first = ar[0];
        last = ar[wrd.length()-1];
        ar[wrd.length()-1] = first; //SOUNAK
        ar[0] = last;
        for(int k = 0; k < wrd.length();k++)
        a += ar[k];
        swapwrd = a;        
    }
    void display()
    {
        System.out.println("\nOriginal Word: "+wrd);
        System.out.println("Length of word: "+wrd.length());
        System.out.println("Swap Characters: "+ swapwrd);
    }
    public static void main(String args[])
    {
        SwapSort ob = new SwapSort();
        ob.read();
        ob.swapChar();
        ob.display();
    }
}