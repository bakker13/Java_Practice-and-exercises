public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("The current balance is " + balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Account() { //constructor chaining
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email,
                   String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 10.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void doDeposit(double depositMoney) {

        if (depositMoney < 0) {
            System.out.println("Error!");
        } else {
            balance += depositMoney;
            System.out.println("The new balance after deposit is: " + balance);
        }
    }

    public void doWithdraw(double withdrawMoney) {

        if (withdrawMoney > balance) { //vagy (balance - withdrawMoney < 0)
            System.out.println("This is not allowed. Not enough money!");
        } if (withdrawMoney < 0) {
            System.out.println("Error!");
        }else {
            balance -= withdrawMoney;
            System.out.println("The new balance after withdraw is : "  + balance);
        }
    }
}
