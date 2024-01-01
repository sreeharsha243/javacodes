/*

@FunctionalInterface //interface having single method
interface MyLamda
{
    public void display();
    //public int add(int x,int y);
}

*/
/*class My implements MyLamda
{
    public void display()
    {
        System.out.println("Hello world");
    }
}*//*
 //outer class

class useLamda
{
    public void calllamda(MyLamda ml){
        ml.display();
    }
}

class Demo
{
    //int temp=10;
    public void method1()
    {
        */
/*int count=0;
        MyLamda m=()->
        {
            System.out.println("hi");
            System.out.println("bye "+(temp++));
        };

        m.display();*//*


        useLamda ul=new useLamda();
        ul.calllamda(()-> System.out.println("hello"));
    }
}

public class lamdaDemo
{
    public static void main(String args[])
    {
        */
/*MyLamda m=new MyLamda() {
            public void display() {
                System.out.println("hello world");
            }
        }*//*
 //lengthy code for overriding method inner class
        */
/*MyLamda m=(a,b)-> a+b; //less code using lambda expressions
        System.out.println(m.add(20,30));*//*


        Demo d=new Demo();
        d.method1();
    }
}
*/

@FunctionalInterface
interface MyLamda
{
    public int display(String str,String str2);
}

public class lamdaDemo
{
    /*public void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/

    public lamdaDemo(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void main(String args[])
    {
        MyLamda ml=String::compareTo; //making static method
        System.out.println(ml.display("b","a"));
    }
}