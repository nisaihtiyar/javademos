public class Main {
    public static void main(String[] args) {
        //log lama yontemi

//        BaseLogger [] loggers =new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("Log mesaji");
//        }
        CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}