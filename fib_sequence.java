import java.util.Scanner;

public class fib_sequence{
    public static void main(String[]args){
      int [] array= new int [20];
      int i; 
        System.out.println("Fibonacci Series till 20th terms:");
        for (i=0; i<array.length; i++){ 
            array[i]= array[i-1] + array[i-2];  
        }
        for(i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        

    }
        
}

