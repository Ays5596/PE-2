package ex;
import java.util.Scanner;
public class revPalin {
    String s;
    public static boolean revPalin(String s){
        char[] q = new char[s.length()];
        for(int i=0;i<s.length();i++){
           q[i] = s.charAt(s.length()-1-i);
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {  if(q[i] == s.charAt(i))
             c++;
        }
        if(c==s.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println("Enter an input :");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("Input is palindrome : "+ revPalin(s));
    }
}
