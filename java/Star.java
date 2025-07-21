import java.util.*;
public class Star{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=s.nextInt();
        for(int i=1;i<=rows;i++)
        {
        for(int j=i;j<=rows;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
        }
    }
}

  