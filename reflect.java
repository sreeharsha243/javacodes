import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}

    public My(int x,int y){}

    public void display(String s1,String s2){}
    public int show(int x, int y){return 0;}
}

public class reflect
{
    public static void main(String args[])
    {
        Class c=My.class;

        Field field[]=c.getDeclaredFields();

        Method meth[]=c.getMethods();

        /*for(Method m:meth)
            System.out.println(m);*/

        Parameter param[]=meth[0].getParameters();

        for(Parameter p:param)
        {
            System.out.println(p);
        }
    }
}
