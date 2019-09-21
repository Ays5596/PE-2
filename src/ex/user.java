package ex;
import java.util.Scanner;
public class user {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public boolean isValidAge(int age){
        if(age>=18 | age<=60)
            return true;
        else
            return false;
    }
    public String getFullName(String firstName, String lastName){
        String name = firstName +" "+ lastName;
        return name;
    }
}

