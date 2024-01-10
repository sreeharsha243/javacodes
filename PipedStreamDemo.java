import java.io.*;

class Producer extends Thread
{
    OutputStream os;

    public Producer(OutputStream o)
    {
        os=o;
    }
    public void run()
    {
        int count=1;

        while(true)
        {
            try {
                os.write(count);
                os.flush();
                System.out.println("producer "+count);
                System.out.flush();
                count++;
                try{Thread.sleep(10);}catch (Exception e){}
            }
            catch (Exception e){

            }
        }
    }
}

class Consumer extends Thread
{
    InputStream is;

    public Consumer(InputStream i)
    {
        is=i;
    }
    public void run()
    {
        int x;

        while(true)
        {
            try {
                x=is.read();
                System.out.println("consumer "+x);
                System.out.flush();
                try{Thread.sleep(10);}catch (Exception e){}

            }
            catch (Exception e){

            }
        }
    }
}

public class PipedStreamDemo
{
    public static void main(String args[])throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pis.connect(pos);

        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);

        p.start();
        c.start();
    }
}
