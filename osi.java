/*class Outer
{
    int x=10;
    class inner
    {
        int y=20;
        void innerdisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerdisplay()
    {
        inner i=new inner();
        i.innerdisplay();
    }
}

public class osi 
{
    public static void main(String args[])
    {
        Outer i=new Outer();
        i.outerdisplay();
    }
    
}*/

/*class local
{
    void diplay()
    {
        class inner
        {
            void innerdisplay()
            {
                System.out.println("hello");
            }
        }
        inner i=new inner();
        i.innerdisplay();
    }
}
public class osi
{
    public static void main(String args[])
    {
        local l=new local();
        l.diplay();
    }
}*/

/*abstract class my
{
    abstract void display();
}
class anonymous
{
    public void meth()
    {
        my m=new my(){
            public void display()
            {
                System.out.println("hiiiii");
            }
        };
        m.display();
    }
}

public class osi
{
    public static void main(String args[])
    {
        anonymous a=new anonymous();
        a.meth();
    }
}*/


class outer
{
    static int x=10;
    int y=20;
    static class inner
    {
        void display()
        {
            System.out.println(x);
        }
    }
}

public class osi
{
    public static void main(String args[])
    {
        outer.inner i=new outer.inner();
        i.display();

    }
}