import java.util.*;
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a 1st number:");
        int a=s.nextInt();

        System.out.println("Enter a 2nd number:");
        int b=s.nextInt();

        int sum=a+b;
        System.out.println("The sum of two number"+sum);
        int sub=a-b;
        System.out.println("The sub of two number"+sub);
        int mul=a*b;
        System.out.println("The mul of two number"+mul);
        int div=a/b;
        System.out.println("The div of two number"+div);
        s.close();

    }
}
