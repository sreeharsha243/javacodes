/*public class checkuncheck
{
    public static void main(String args[])
    {
        try{
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}*/

public class checkuncheck
{
       static int area(int l,int b) throws Exception
        {
            if(l<=0||b<=0)
                throw new Exception("values can't be negative");
            int a=l*b;
            return a;
        }
        public static void main(String args[])
        {
            try{
                int a=area(10,10);
                System.out.println(a);          
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    
}