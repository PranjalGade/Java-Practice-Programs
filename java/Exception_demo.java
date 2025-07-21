import java.util.*;
public class Exception_demo
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        System.out.println("Enter a number");
        int b=s.nextInt();
        System.out.println("Start calculations");
        try{
            System.out.println("file opened");
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("file closed");
        }
        
        System.out.println("End calculation");
    }
}
