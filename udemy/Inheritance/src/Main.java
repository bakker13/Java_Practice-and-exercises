public class Main {

    public static void main(String[] args) {

        Employee rob = new Employee("Robert", "09/13/1991",
                "05/14/2024");
        System.out.println(rob);
        System.out.println("Age = " + rob.getAge());
        System.out.println("Pay = " + rob.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension chack = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Pacheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
}
