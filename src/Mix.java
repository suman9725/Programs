import java.util.Scanner;
class Mix
{
    String word;
    int len;
    Mix()
    {
        word = "";
        len = 0;
    }
    void feedword()
    {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the String: ");
            word = sc.next();
            word=word.toUpperCase();
    }
    void mix_word(Mix P, Mix Q)
    {
        System.out.println(word);
        int l1,l2,l,i;
        String big;
        l1 = P.word.length();
        l2 = Q.word.length();
        if(l1<l2)
        {
            l = l1;
            big = Q.word;
        }
        else
        {
            l = l2;
            big = P.word;
        }
        for(i=0;i<l;i++)
        {
            word = word + P.word.charAt(i)+Q.word.charAt(i);
        }
        
        word = word + big.substring(i);
        len = word.length();
    }
    void display()
    {
        System.out.println(word);
    }
    public static void main(String args[])
    {
        Mix M1 = new Mix();
        Mix M2 = new Mix();
        Mix M = new Mix();
        M1.feedword();
        M2.feedword();
        M.mix_word(M1, M2);
        M.display();
    }
}