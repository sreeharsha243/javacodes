/* INPUT STREAM
  int read()
* int read(byte[] b)
* int read(byte[] b,int off,int len)
*
* int available()
* int skip(long n)
*
* void mark(int limit)
* void reset()
* boolean markSupported()
* void close()

  OUTPUT STREAM
  void write(int b)
  void write(byte[] b)
  void write(byte[] b,int off,int len)

  void flush()
  void close()*/

import java.io.*;
public class IOstream
{
    public static void main(String args[]) throws Exception
    {
           /* try (FileOutputStream fos = new FileOutputStream("C:/Users/91939/Java/test.txt")) {
                String str = "Learn java programming";

                byte b[] = str.getBytes();

                fos.write(b, 0, str.length());

                *//*for(byte x:b)
                fos.write(x);*//*

                //fos.write(str.getBytes());
                fos.close();
            }*/

        try (FileReader fis = new FileReader("C:/Users/91939/Java/test.txt")) {
            /*byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);*/

            int x;

            do{
                x=fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while (x!=-1);
        }
    }
}
