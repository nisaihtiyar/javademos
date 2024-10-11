import java.util.ArrayList;

//        ArrayList<String> sehirler =new ArrayList<String>();
//        sehirler.add("ankara");
//        sehirler.add("istanbul");
//        sehirler.add("izmir");
//
//        //buradaki string tipindeki array list bir generic tir
//        //generic tip bazinda calismamizi saglar

public class Main {
    public static void main(String[] args) {
        MyList<Customer> sehirler=new MyList<Customer>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());
    }
}