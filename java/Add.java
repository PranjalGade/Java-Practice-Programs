import java.util.*;
public class Add {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int num1=s.nextInt();

        System.out.println("Enter 2nd number:");
        int num2=s.nextInt();

        int sum=num1+num2;
        System.out.println("The sum of two number:"+sum);
        s.close();
    }
    
}

