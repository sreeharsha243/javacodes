import java.util.*;

public class NestedLoops 
{
    public static void main(String args[])
    {
        /*Scanner m=new Scanner(System.in);

        System.out.println("enter the two numbers");

        int n=m.nextInt();
        int n1=m.nextInt();
        int count=0;


        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");           //try for i,j,i+j,and count

            }
            System.out.println("");      //
        }*/

        Scanner m=new Scanner(System.in);
        
        System.out.println("enter the two values");
        int n=m.nextInt();
        int n1=m.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n1;j++)
            {
                if(j<=i)
                System.out.print("* ");
                else
                System.out.print("- ");
            }
            System.out.println("");
        }
    }
    
}
