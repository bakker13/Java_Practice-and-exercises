import java.util.ArrayList;

record Customer (String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

    public class Main {

        public static void main(String[] args) {

            Customer jim = new Customer("Jim B", 1000.0);
            System.out.println(jim);

            Bank bank = new Bank("Revolut");
            bank.addNewCustomer("Jane S", 500.0);
            System.out.println(bank);
        }
    }