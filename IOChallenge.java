import java.io.*;

public class IOChallenge
{
    public static void main(String args[]) throws Exception
    {
        /*FileInputStream fis=new FileInputStream("c:/Users/91939/Java/test.txt");

        byte b[]=new byte[fis.available()];
        fis.read(b);
        String str=new String(b);
        String str2=str.toLowerCase();

        FileOutputStream fos=new FileOutputStream("C:/Users/91939/Java/test1.txt");

        byte b1[]=str2.getBytes();
        fos.write(b1);

        fis.close();
        fos.close();*/


        FileInputStream fis1=new FileInputStream("c:/Users/91939/Java/test.txt");
        FileInputStream fis2=new FileInputStream("c:/Users/91939/Java/test1.txt");

        FileOutputStream fos1=new FileOutputStream("C:/Users/91939/Java/dest.txt");

        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);

        byte b[]=new byte[fis1.available()];
        fis1.read(b);

        byte b2[]=new byte[fis2.available()];
        fis2.read(b2);

        fos1.write(b);
        fos1.write(b2);

        fos1.close();
        fis1.close();
        fis2.close();

    }
}
