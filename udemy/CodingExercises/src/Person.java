public class Person {
    // write code here

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        if(newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {

        if(firstName.isEmpty() == true && lastName.isEmpty() == true) {
            return "";
        } else if (lastName.isEmpty() == true) {
            return firstName;
        } else if (firstName.isEmpty() == true) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }
}