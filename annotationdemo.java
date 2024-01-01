import java.lang.annotation.*;
import java.util.*;

/*
abstract class parent
{
     public void display()
    {

    }
}

class child extends parent
{
    @Override
    public void display() {

    }
}

class oldclass
{
    public void display()
    {
        System.out.println("hello");
    }

    @Deprecated  //used to inform not to use these methods
    public void show()
    {
        System.out.println("hi");
    }
}

class my<T>
{
    @SafeVarargs //for unsafe operations
    private void show(T...arg)
    {
        for(T x:arg)
            System.out.println(x);
    }
}

@FunctionalInterface
interface you
{
    public void show();
    //public int add(int x,int y);
}
*/


//@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value = ElementType.TYPE_USE)
@Inherited //for all sub classes of it
//@Repeatable(MyAnno.class)

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name = "ajay",project = "bank")

public class annotationdemo
{
    /*static List l;

    @SuppressWarnings("unchecked") //avoid the warnings of particular annotation
    public static void main(String args[])
    {
        l.add(10);

        *//*oldclass o=new oldclass();
        o.show();*//*

    }*/

    public static void main(String args[])
    {

        int x;
    }
}
