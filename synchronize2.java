class MyData
{
    int value=0;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
            try{wait();} catch(Exception e){}
        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        
        while(flag!=false)
            try{wait();} catch(Exception e){}

        x=value;
        flag=true;
        notify();
        return x;
    }
}

class producer extends Thread
{
    MyData data;

    public producer(MyData d)
    {
        data=d;
    }

    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("producer"+count);
            count++;
        }
    }
}

class consumer extends Thread
{
    MyData data;

    public consumer(MyData d)
    {
        data=d;
    }

    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("consumer"+value);
        }
    }
}

public class synchronize2
{
    public static void main(String args[])
    {
        MyData data=new MyData();

        producer p=new producer(data);
        consumer c=new consumer(data);

        p.start();
        c.start();
    }

}