public class Main {
    public static void main(String[] args) {


//        BaseLogger[] allLoggers=new BaseLogger[]{new BaseLogger(),new DatabaseLogger(),new EmailLogger(),new FileLogger()};
//
//        for (BaseLogger logger:allLoggers){
//            logger.Log("log mesajı");
//        }



        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}