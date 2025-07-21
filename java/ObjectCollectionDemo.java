import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class ObjectCollectionDemo {
    public static void main(String[] args) {
        
        List al=new ArrayList<>();
        al.add(new C(1,2));
        al.add(new C(100,20));
        al.add(new C(10,200));
        al.add(new C(-1000,2000));
        System.out.println(al);

        Iterator itr=al.iterator();  //print the ele
        while(itr.hasNext()){
            C ob=(C) itr.next();
            System.out.println(ob.a);
        }
        Collections.sort(al,new Comparator<C>(){      //sort ele
            
            public int compare(C a, C b){
               // return Double.compare(a.a,b.a);    //ascending order
               // return b.a-a.a;                    //Descending order
               return a.a-a.b;                       //ascending order

            }

        });

        System.out.println("After sort");
        itr=al.iterator();
        while(itr.hasNext()){
            C ob=(C) itr.next();

            System.out.println(ob.a);
        }
            
        }
    }
    


class C{
            int a,b;
            C(int a,int b){
                this.a=a;
                this.b=b;
            }
        }

