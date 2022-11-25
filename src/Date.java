import java.util.*;
public class Date 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date in DD/MM/YY Format:");
        String a = sc.next(); // 22/2/2022

        int date[] = {0, 31, 28, 31, 30, 31,30,31,31,30,31,30,31};

        StringTokenizer st = new StringTokenizer(a,"/");
        int count = st.countTokens();
        if(count != 3)
        {
            System.out.println("Wrong Date format");
            return;
        }
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
        if(z%4==0)
        {
            date[2] = 29;
        }
        int sum =0;
        for(int i =0 ; i < y; i++)
        {
            sum = sum + date[i];
        }
        sum = sum + x;
        System.out.println("The absolute date: " + sum + "Days");
        

    }
}
