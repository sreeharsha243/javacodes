import java.io.*;

public class FileHandle
{
    public static void main(String args[])throws Exception
    {
        /*File f=new File("C:/Users/91939/Java");

        System.out.println(f.isDirectory());
        //String list[]=f.list();

        File list[]=f.listFiles();
        for(File x:list)
        {
            System.out.println(x.getName()+" ");
            System.out.println(x.getParent());
        }*/

        File f=new File("C:/Users/91939/Java/test.txt");
        //f.setWritable(true);
        FileOutputStream fos=new FileOutputStream("C:/Users/91939/Java/test.txt");
    }
}