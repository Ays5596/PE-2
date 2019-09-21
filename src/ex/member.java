package ex;
import java.util.Scanner;
public class member {
    String name;
    int age;
    double Salary;
    public void member(String n, int a, double sal){
        name = n;
        age = a;
        Salary = sal;
        System.out.println("Members Name:" +name+ "\nMembers Age:" +age+ "\nMembers Salary:" +Salary);
    }

    public static void main(String[] args){
        System.out.println("Enter name, age, salary of member:");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int a = input.nextInt();
        double sal = input.nextDouble();
        member obj = new member();
        obj.member(n,a,sal);
    }
}
