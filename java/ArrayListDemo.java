import java.util.List;
public class ArrayListDemo{
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println(al);

        al.add(1,"D");
        System.out.println(al);

        al.remove(2);
    }
}
