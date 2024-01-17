import java.io.*;

public class BufferDemo
{
    public static void main(String args[])throws Exception
    {
        /*FileInputStream fis=new FileInputStream("C:/Users/91939/Java/test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        *//*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*//*

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());*/

        FileReader fr=new FileReader("C:/Users/91939/Java/test.txt");
        BufferedReader br=new BufferedReader(fr);

        System.out.print((char) br.read());
        System.out.print((char) br.read());
        System.out.print((char) br.read());
        br.mark(10);
        System.out.print((char) br.read());
        System.out.print((char) br.read());
        //br.reset();
        System.out.print((char) br.read());
        System.out.print((char) br.read());

        System.out.println(br.readLine());


    }
}