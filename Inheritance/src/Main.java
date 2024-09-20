public class Main {
    public static void main(String[] args) {
        //Inheritance --> Miras
        Customer customer = new Customer();
        Employee employee = new Employee();

        //Person class inda tanimlanan ozellikler customer ve employee icin de gecerli
        //Sebebi inheritance yani miras
        //classlari yazarken extends .... sekl'nde belirtilen class dan miras alir
        //boylelikle ortak ozellikleri tekrar tekrar yazmaya gerek kalmaz

        CustomerManager costumerManager = new CustomerManager();
        EmployeeManager employeeManager= new EmployeeManager();
        //Aynisi buradaki meotdlar icin de gecerli

    }
}