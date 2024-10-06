public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();

        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("Credit limit: " + customer.getCustomerCreditLimit());
        System.out.println("Customer email: " + customer.getCustomerEmail());

        System.out.println();


        Customer robert = new Customer("Robert", 100.00,
                "bakker@mymail.com");

        System.out.println("Name: " + robert.getCustomerName());
        System.out.println("Credit limit: " + robert.getCustomerCreditLimit());
        System.out.println("Customer email: " + robert.getCustomerEmail());

        System.out.println();


        Customer bob = new Customer("Bob", "bob@myemail.com");

        System.out.println("Name: " + bob.getCustomerName());
        System.out.println("Credit limit: " + bob.getCustomerCreditLimit());
        System.out.println("Customer email: " + bob.getCustomerEmail());
    }
}
