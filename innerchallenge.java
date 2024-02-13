
class whiteBoard
{
    String text;
    int noofstudents=0;
    int count=0;

    public void attendance()
    {
        noofstudents++;
    }

    synchronized public void write(String msg)
    {
        System.out.println("teacher is writing "+msg);
        while(count!=0)
            try{wait();} catch(Exception e){}
        text=msg;
        count=noofstudents;
        notifyAll();
    }

    synchronized public String read()
    {
        while(count==0)
            try{wait();} catch(Exception e){}
        String a=text;
        count--;
        if(count==0)
         notify();
        return a;
    }
}

class Teacher extends Thread
{
    whiteBoard wb;
    String name[]={"hello","JNNCE","shimoga","end"};

    public Teacher(whiteBoard w)
    {
        wb=w;
    }

    public void run()
    {
        for(int i=0;i<name.length;i++)
            wb.write(name[i]);
    }
}

class student extends Thread
{
    String name;
    whiteBoard wb;
    
    public student(String n,whiteBoard w)
    {
        wb=w;
        name=n;
    }

    public void run()
    {
        String text;
        wb.attendance();

        do{
            text=wb.read();
            System.out.println(name+" reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}


public class innerchallenge
{
    public static void main(String args[])
    {
        whiteBoard wb=new whiteBoard();

        Teacher t=new Teacher(wb);

        student s1=new student("1.john",wb);
        student s2=new student("2.harsha",wb);

        t.start();
        s1.start();
        s2.start();
    }
}