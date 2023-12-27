class MyThread extends Thread //using extends
{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++);
            try
            {
            Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

/*class My implements Runnable //using Runnable interface
{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}*/

class multiprogramming{
    public static void main(String args[]){
        /*My m=new My();
        Thread t=new Thread(m);

        // MyThread t=new MyThread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
            
        }*/
        MyThread t=new MyThread();
        t.start();
        t.interrupt();
    }
}

/* State of thread
 Start,RUN, running(wait,timed wait,blocked),END */

/*Thread properties 
1.Schedules : based on priority they will be executed like higher the priority, higher the time of execution and preference in executing among others.
ex: MS word using spell checker and typing at a time. */
