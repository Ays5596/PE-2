package ex;
import java.util.Scanner;
public class EvenNumTest {
    public static boolean isEven(int x){
        if(x%2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.println("Please enter number to check it is even or not:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Number is Even: "+isEven(n));
    }

}
