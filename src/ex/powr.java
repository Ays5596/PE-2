package ex;
import java.util.Scanner;
public class powr {
      int n;
      public static boolean powr(int n){
          if(n==0)
              return false;
          else
          {  for(;n==0;)
          {  if(n%4 != 0)
                 return false;
              else
                  n = n/4;
          }
             return true;
          }
      }

    public static void main(String[] args){
        System.out.println("Enter a number :");
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Number is power of 4 : " + powr(num));

    }
}
