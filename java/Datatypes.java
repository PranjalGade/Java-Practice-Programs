import java.util.*;
public class Datatypes {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a byte value:");
        byte b=s.nextByte();
        System.out.println("byte"+b);

        System.out.println("Enter a short value");
        short sh=s.nextShort();
        System.out.println("short"+sh);

        System.out.println("Enter a int value");
        int i=s.nextInt();
        System.out.println("Int"+i);

        System.out.println("Enter a long value");
        long l=s.nextLong();
        System.out.println("Long"+l);

        System.out.println("Enter a Float value");
        float f=s.nextFloat();
        System.out.println("Float"+f);

        System.out.println("Enter a char value");
        char c=s.next().charAt(0);
        System.out.println("char"+c);
    }
}
    

