class ATM
{
    synchronized public static void checkBalance(String name)
    {
        System.out.println(name+"checking");
    try
    {
        Thread.sleep(100);
    }
    catch(Exception e){}
    }

    synchronized public static void withdraw(String name, int amount)
    {
        System.out.println(name+"withdrawing"+amount);
    try
    {
        Thread.sleep(100);
    }
    catch(Exception e){}
    }
}

class customer extends Thread
{
    String name;
    int amount;
    ATM atm;

    customer(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    } 

    public void useATM()
    {
        ATM.checkBalance(name);
        ATM.withdraw(name,amount);
    }

    public void run()
    {
        useATM();
    }
}

public class synchallenge
{
    public static void main(String args[])
    {
        ATM atm=new ATM();
        customer c1=new customer("smith",atm,100);
        customer c2=new customer("john",atm,200);
        c1.start();
        c2.start();
    }
}