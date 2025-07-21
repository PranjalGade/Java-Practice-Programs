import java.util.*;
public class ExceptionHandling
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        System.out.println("Enter a number");
        int b=s.nextInt();
        System.out.println("Start calculations");
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception_demo e){
            System.out.println( "Divide by zero"+e);
        }
        
        System.out.println("End calculation");
    }
}