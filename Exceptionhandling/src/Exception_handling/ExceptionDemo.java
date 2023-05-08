
package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int balance=1000;
      
     System.out.println("enter need of your amount  ");
     int withdraw=sc.nextInt();
     try {
     if(balance< withdraw)
    	 throw new InsufficientBalanceException(balance-withdraw);
     else 
    	 System.out.println(" enough money"); 
     }
     catch(InsufficientBalanceException e) {
              System.out.println("not enough money"); 
    	 }
     
      }
     

}
