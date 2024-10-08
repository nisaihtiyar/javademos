public class Main {
    public static void main(String[] args) {
        //bir class birden fazla interface implente edebiliyo
        //extend de bu mumkun olmaz!!
       //ICustomerDal costumerdal = new MySqlCustomerDal();

       CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

       customerManager.add();
    }
}