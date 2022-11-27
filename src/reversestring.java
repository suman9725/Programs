import java.util.*;
class reversestring
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String st = sc.nextLine();
    st=st.trim();
    int l = st.length();
    char last = st.charAt(l-1);
    if(last == '.' || last == '!' || last == '?')
    {
        String o = st.substring(0, l-1); // JAVA IS LION
        o = o + " ";  
        String revsen ="";
        String word = "";
        for(int i=0;i<o.length();i++)
        {
            char ch = o.charAt(i);
            if(ch != ' ')
            {
                word = word + ch;
            }
            else
            {
                revsen = word + " " + revsen; // JAVAIS 
                word ="";
            }
        }
        System.out.println(revsen.trim()+last);
    }
    else
    {
        System.out.println("INVALID SENTENCE");
    }
}
}