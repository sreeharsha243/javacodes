class hondacity
{
    static long price=10;
    int a,b;
    double onroadprice(String city)
    {
        switch(city)
        {
            case "delhi":return price+price*0.1;
            case "mumbai":return price+price*0.09;
            default:return 0;
        }
    }
}

public class honda 
{
    public static void main(String args[])
    {
        hondacity h=new hondacity();
        System.out.println(h.onroadprice("mumbai"));
    }
}
