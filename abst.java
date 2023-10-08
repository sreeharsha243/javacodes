abstract class shape
{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape
{
    double radius=2;

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class rectangle extends shape
{
    double length=10;
    double breadth=20;
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}

public class abst
{
    public static void main(String args[])
    {
        rectangle r=new rectangle();
        System.out.println(r.perimeter());
        System.out.println(r.area());

        circle c=new circle();
        System.out.println(c.area());
        System.out.println(c.perimeter());

        shape s=new circle();  //it cannot create objects it can create references

    }
    
}
