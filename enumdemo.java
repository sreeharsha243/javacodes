enum Dept
{
    CS("john","A"),IT("smith","B"),CIVIL("srinivas","C"),ECE("Dave","d");

    String name;
    String location;
    private Dept(String name,String loc)
    {
        this.name=name;
        this.location=loc;
    }

    public String headName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }
    /*public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }*/
}

public class enumdemo
{
    public static void main(String args[])
    {
        Dept d=Dept.CS;

        System.out.println(d.headName());
        System.out.println(d.getLocation());

       /* Dept list[]=Dept.values();

        for(Dept x:list)
            System.out.println(x);*/

        /*switch (d)
        {
            case CS :
                System.out.println("head : John \nBlock : A");
                break;
            case IT:
                System.out.println("head : smith \nBlock : B");
                break;
            case CIVIL:
                System.out.println("head : srinivas\nBlock : C");
                break;
            case ECE:
                System.out.println("head : Dave \nBlock : D");
                break;
        }*/
    }
}
