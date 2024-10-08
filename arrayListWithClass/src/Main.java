import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer nisa = new Customer(2,"Nisa","Ihtiyar");

        customers.add(new Customer(1,"Dilara","Ihtiyar"));
        customers.add(nisa);
        customers.add(new Customer(3,"Ali","Ihtiyar"));

        customers.remove(nisa);

        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}