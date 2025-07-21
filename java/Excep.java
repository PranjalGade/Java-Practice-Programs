public class Excep{
    public static void main(String[] args){
        double balance=1000;
        System.out.println("Balance before"+balance);
        double wAmt=2000;
        try{
            if(wAmt<balance){
                balance=balance-wAmt;
            }
            else{
                throw new Exception();
            }
            System.out.println("After withdraw");
        }
        catch(Exception e){
            System.out.println("Insufficient funds");
        }
        

    }
}