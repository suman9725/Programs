import java.util.Scanner;
class Revno
{
    int num,rev;
    Revno()
    {
        rev=0;
        num = 0;
    }
    void input()
    {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the String: ");
        num = sc.nextInt();
    }
    }
    void reverse()
    {
        String r="";
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            r=ch+r;
        }
        int o = Integer.parseInt(r);
        rev=o;
    }
    void display()
    {
        System.out.println("Output:\n Original No:"+num+"\nReverse No. :"+rev);
    }
    public static void main(String[] args)
    {
        Revno ob = new Revno();
        ob.input();
        ob.reverse();
        ob.display();
    }
}