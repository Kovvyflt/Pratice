import java.util.Scanner;

public class fib_sequence{
    public static void main(String[]args){
        int a=0;
        int b=1;
        int n=20;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i=0; i<n; i++){
            
            int total=a+b;
            a=b;
            b=total; 

            System.out.println(total);
        }

    }
}
