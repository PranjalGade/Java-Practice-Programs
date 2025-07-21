public class Throw{
    public static void main(String[] args){
        System.out.println("Before call");
        try{
            add();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException aio){
            
        }
        System.out.println("After call");
    }
    static void add() throws ArithmeticException,ArrayIndexOutOfBoundsException
    { 
        int a=10,b=0;
        int c=a/b;
        System.out.println(c);
    }
}