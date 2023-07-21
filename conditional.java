import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class conditional 
{
    public static void main(String args[])
    {
        /*int a=10,b=7,c=9;

        if(a>b&&a>c)
        {
            System.out.println("a is bigger");
        }
        else
        if(b>c)
        {
            System.out.println("b is bigger");
        }
        else
        {
            System.out.println("c is bigger");
        }*/

        //given number is even or odd

        /*Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("even");
        }
        else 
        {
            System.out.println("odd");
        }*/
        

        //age of a person
        /*Scanner sc=new Scanner(System.in);

        System.out.println("enter the age of a person");
        int n=sc.nextInt();

        if(n>=15&&n<=40)
        {
            System.out.println("you are young");
        }
        else
        {
            System.out.println("you are not young");
        }*/

        //radix of a given number in a string

        /*Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        String num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("binary number = 2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("octa decimal = 8");
            
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("decimal number = 10");
        }
        else if(num.matches("[0-9A-Fa-f]+"))
        {
            System.out.println("hexa decimal number = 16");

        }
        else 
        {
            System.out.println("not a valid number");
        }*/

        //finding given year is a leap year or not

        /*Scanner m=new Scanner(System.in);
        
        System.out.println("enter the year");

        int year=m.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("it's a leap year");
                }
                else
                {
                    System.out.println("it's not a leap year");
                }
            }
            else
            {
    
                System.out.println("it' a leap year");
            }

        }
        else
        {
            System.out.println("it's not a leap year");
        }*/

        //display name of a day based on a number
        
        /*Scanner m= new Scanner(System.in);

        System.out.println("enter the day");

        int n=m.nextInt();

        switch(n)
        {
            case 1:System.out.println("monday");
                   break;
            case 2:System.out.println("tuesday");
                   break;
            case 3:System.out.println("wednesday");
                   break;  
            case 4:System.out.println("thursday");
                   break; 
            case 5:System.out.println("friday");
                   break;
            case 6:System.out.println("saturday");
                   break;
            case 7:System.out.println("sunday");
                   break;           
            default:System.out.println("invalid day");
                   break;       
        }*/

        //find the type of website and protocol used using if else

        /*Scanner sc=new Scanner(System.in);

        System.out.println("enter the URL");

        String url=sc.nextLine();

        String protocol=url.substring(0,url.indexOf("."));

        if(protocol.equals("http"))
        {
            System.out.println("hyper text transfer protocol");
        }
        else
        {

            System.out.println("file transfer protocol");
        }

        String type=url.substring(url.lastIndexOf(".")+1);
        
        if(type.equals("com"))
             System.out.println("commercial");
        else if(type.equals("net"))
             System.out.println("network");   
        else 
            System.out.println("organisation");       
        }*/

        //display type of website using switch

        Scanner h=new Scanner(System.in);

        System.out.println("enter the url");

        String url=h.nextLine();

        String ext=url.substring(url.lastIndexOf(".")+1);

        switch(ext)
        {
            case "net":System.out.println("network");
                       break;
            case "org":System.out.println("organisation");
                       break;
            case "gov":System.out.println("goverment");
                       break;
            case "edu":System.out.println("education");
                       break;
            default:System.out.println("invalid url or it cannot found in our data");
                
        }
    
    }
}    

