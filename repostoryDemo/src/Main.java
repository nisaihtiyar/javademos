//veritabani islemleri icin repostory deseni kullanilir!
//burada amac hem product hem customer icin ayri ayri veritabani islemleri yazmamaktir
//IEntityRepository altinda yazilan islemleri <T> tipi ile generic yapiya donustururuz
//Daha sonrasinda Dal classlarinda da kullanacagimiz veri tipi neyse ona gore override ederiz

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}