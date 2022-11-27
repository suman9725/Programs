import java.util.*;
class Composite
{
    int arr[][];
    int m , n;
    Composite(int mm, int nn)
    {
        m = mm;
        n = nn;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        arr = new int[m][n];
        System.out.println("Enter the array");
        for(int i = 0 ; i<m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    int isComposite(int p)
    {
        int c=0;
        for(int i=1; i<=p;i++)
        {
            if(p%i==0)
            c++;
        }
        if(c>2)
        return 1;
        else
        return 0;
    }
    void fill()
    {
        int k=0;
        for(int i = 0 ; i<m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                while(isComposite(k)==0)
                {
                    k++;
                }
                arr[j][i] = k;
                k++;
            }
        }
    }
    void display()
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the Columns: ");
        int n = sc.nextInt();
        Composite ob = new Composite(m, n);
        ob.input();
        ob.fill();
        ob.display();
    }
}