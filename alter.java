import java.util.Scanner;
class alter
{
    String s,u,v;
    int len;
    
    alter()
    {
        u="";
        v="";
        s="";
        len=0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=sc.nextLine();
    }
    void alternate()
    {
        len = s.length();
        for (int i=0;i<len;i=i+2) 
        {
            char a = s.charAt(i);
            u = u+a;
        }
        for (int j=len-1;j>0;j=j-2) 
        {
            char b = s.charAt(j);
            v = v+b;
        }
    }
    void display()
    {
        System.out.println("Original: "+s);
        System.out.println("Alternate: "+u);
        System.out.println("Alternate from behind: "+v);
    }
    public static void main(String[] args) {
        
        alter obj = new alter();
        obj.input();
        obj.alternate();
        obj.display();
    }
}

