//how take user exception 
import java.util.Scanner;
class String11 extends Exception
{
    String11()
    {
        System.out.println("Stringexception comes in your program");
    }
}
class expdemo11
{
    void fuct()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String s=sc.nextLine();
        int res=s.length();
        try
        {
            if(res>0)
            {
                System.out.println("save your name");
            }
            else
            {
                throw new String11();
            }
        }
        catch(String11 a)
        {
            System.out.println(a);
            System.out.println(a.getMessage());
        }
        finally
        {
            System.out.println("enetr another name");
        }
    }
    public static void main(String args[])
    {
        expdemo11 obj=new expdemo11();
        obj.fuct();
    }
}
