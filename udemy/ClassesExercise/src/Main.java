public class Main {

    public static void main(String[] args) {

//        Account account = new Account("12345", 1000.00, "John Smith",
//                "john.smith@gmail.com", "(0036) 123-4567");

        Account account = new Account();

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());

//        account.setNumber("12345");
//        account.setBalance(1000.0);
//        account.setCustomerName("John Smith");
//        account.setCustomerEmail("john.smith@gmail.com");
//        account.setCustomerPhone("(0036) 123-4567");

        account.doDeposit(5000);
        account.doWithdraw(4000);

        Account robAccount = new Account("Robert", "bakker@gmail.com",
                "12345");
        System.out.println("AccountNo: " + robAccount.getNumber() +
                "; name " + robAccount.getCustomerName());

    }
}
