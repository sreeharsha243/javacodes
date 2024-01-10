import java.io.*;

public class ByteStream
{
    public static void main(String args[]) throws Exception
    {
        /*byte b[]={'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis=new ByteArrayInputStream(b);

        int x;

        while((x=bis.read())!=-1)
        {
            System.out.println((char)x);
        }

        String str=new String(bis.readAllBytes());

        System.out.println(bis.markSupported());

        bis.close();*/

        /*ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        *//*byte b[]=bos.toByteArray();

        for(byte x:b)
        {
            System.out.println((char) x);
        }*//*

        bos.writeTo(new FileOutputStream("C:/Users/91939/Java/test2.txt"));*/

        char c[]={'a','b','c','d','e','f','g','h','i','j'};

        CharArrayReader cr=new CharArrayReader(c);

        int x;

        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }

        cr.close();

    }
}
