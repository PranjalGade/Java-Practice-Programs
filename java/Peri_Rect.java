import java.util.*;
public class Peri_Rect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.err.println("Enter the Length:");
        int L=s.nextInt();
        System.err.println("Enter the breadth:");
        int B=s.nextInt();
        int P=2*(L+B);
        System.err.println("The perimeter of rectangle is : "+P);
        s.close();
    }
}
