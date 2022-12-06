import java.util.*;
public class rotate90  
{  
public static void main(String args[])  
{  Scanner sc = new Scanner(System.in);
//matrix to rotate   
System.out.println("Enter m:");
int m = sc.nextInt();
int a[][]= new int[m][m];
System.out.println("Enter the array elements");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }  
System.out.println("Original Matrix: \n");  
//loop for rows  
for(int i=0;i<m;i++)  
{  
//loop for columns  
for(int j=0;j<m;j++)  
{  
//prints the elements of the original matrix  
System.out.print(" "+a[i][j]+"\t");  
}  
System.out.println("\n");  
}  
System.out.println("Rotate Matrix by 90 Degrees Clockwise: \n");  
for(int i=0;i<m;i++)  
{  
for(int j=m-1;j>=0;j--)  
{  
//prints the elements of the rotated matrix  
System.out.print(a[j][i]+" ");  
}  
System.out.println();  
}  
}  
}   