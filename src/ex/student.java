package ex;
import java.util.Scanner;
public class student {

    public static void check(int g){
        Scanner input = new Scanner(System.in);
        if(!(g>=0) | !(g<=100)){
            System.out.println("invalid input (0-100) inclusive!");
            System.out.println("Enter correct grades:");
            g = input.nextInt();
            check(g);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = input.nextInt();
        int[] g = new int[n];
        for(int i=0;i<n;i++)
        {   System.out.println("Enter the grade for student "+(i+1)+":\n");
            g[i] = input.nextInt();
            check(g[i]);
        }
        System.out.println("The average is "+avg(g));
        System.out.println("\nThe minimum is "+min(g));
        System.out.println("\nThe maximum is "+max(g));
    }
    public static double avg(int[] g){
        int sum=0;
        double a;
        for(int i=0;i<g.length;i++)
        {
            sum = sum + g[i];
        }
        a = sum/g.length;
        return a;
    }
    public static int max(int[] g){
        int max=0;
        for(int i=0;i<g.length;i++)
        {   if(max < g[i])
               max = g[i];
        }
        return max;
    }
    public static int min(int[] g){
        int min = 100;
        for(int i=0;i<g.length;i++)
        {  if(min > g[i])
             min=g[i];
        }
        return min;
    }
}

