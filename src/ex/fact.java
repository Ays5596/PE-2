package ex;
import java.util.Scanner;
public class fact {

    public static void main(String[] args) {
        int I = Integer.MAX_VALUE;
        long L = Long.MAX_VALUE;
        System.out.println("Enter number for factorial:\n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long N = n;
        long f=0;
        int b = 0;
        if (n < 13) {
            System.out.println("Int Factorials:\n");
            for (int i = 1; i <= n; i++) {
                f = fac(i);
                System.out.println("The factorial of " + i + " is " + f + "\n");
            }

        } else {
            System.out.println("Long Factorials:\n");
            for (long j = 1; j <= N; j++)
            {   if(j==21)
                   break;
                f = facl(j);
                System.out.println("The factorial of " + j + " is " + f + "\n");
            }
            if (n>=21){
                System.out.println("The factorial of 21 is out of range\n");
            }
        }
    }
    public static int fac(int x){
            if (x == 1)
                return 1;
            else
                return fac(x - 1) * x;
        }
    public static long facl(long x){
        long n=1;
        if(x==1)
            return 1;
        for(long i=2;i<=x;i++)
            n = n*i;
        return  n;
    }
}
