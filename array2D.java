import java.util.*;

public class array2D  
{
    public static void main(String args[])
    {

        //creating 2D array
        /*int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int b[][]={{1,2,3},{4,5,6,7},{1,3,5,7,9,10}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.format("%02d ",a[i][j]);
            }
            System.out.println("");
        }

        //  jagged array
        for(int x[]:b)
        {
            for(int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println(" ");
        }*/

        //adding two 2D arrays

        /*int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};

        int c[][]=new int[5][5];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }*/

        //multiplying two matrices

        /*int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};

        int c[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
                System.out.print(c[i][j]+" ");
            }    
            System.out.println(" ");
        }*/

        //sorting the array strings

        String arr[]={"cat","rat","animal","bat","elephant","lion"};

        java.util.Arrays.sort(arr);
        
        for(String x:arr)
            System.out.println("array strings are "+x);

    }
    
}
