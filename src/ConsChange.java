import java.util.Scanner;
public class ConsChange 
{
    String word;
    int len;
    ConsChange()
    {
        word = "";
        len = 0;
    }
    void readWord()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the word:");
            word = sc.next();
        }
    }
    void Shifticons()
    {
        String temp =word;
        temp = temp.toLowerCase();
        String s="",t="";
        len = temp.length();
        for(int i = 0;i<len;i++)
        {
            char ch = temp.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' )
            {
                s=s+ch;
            }
            else
            {
                t = t+ch;
            }              
        }
        System.out.println(t+""+s);
    }
    void changeWord()
    {
        String o = "";
        int u;
        for(int i = 0; i<len; i++)
        {
            char ch = word.charAt(i);        
            //String a = String.valueOf(ch);    
            if(Character.isUpperCase(ch))// ABcd
            u = Character.toLowerCase(ch);
            else
            u = Character.toUpperCase(ch);
            ch = (char)u;
            o = o+ch;
        }
        System.out.println("change word: "+o);
        
    }
    
    public static void main(String[] args) 
    {
            ConsChange ob = new ConsChange();
            ob.readWord();
            ob.Shifticons();
            ob.changeWord();
    }

}
