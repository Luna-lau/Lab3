
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luna
 */
public class isPrime {
 public static void main(String[] args)
 {   
         int number;
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Enter a integer: ");
         number = keyboard.nextInt();
         if(isPrime1(number))
          System.out.println(number + " is a prime number");
         else
          System.out.println(number + " is not a prime number");
         System.exit(0);
 }
     public static boolean isPrime1(int number)
     {
         int number1=0;
      for(int number2=2; number2 <=number/2; number2++)
     {
         if(number%number2 == 0)
             number1++;
        // System.out.println(number1);    
         if(number1>0)
             return false;
     }
     return true;
 }
}
