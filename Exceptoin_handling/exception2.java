package Exceptoin_handling;

import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int withdraw=sc.nextInt();
		 int balance=5000;
		 try {
		         if(balance<withdraw) 
		         {
			          throw new ArithmeticException("Insufficient balance");
			      }
		         else
		         {
			         balance=balance-withdraw;
			         System.out.println("Available balance:"+balance);
			         System.out.println("Transcation Successfull");
		         }
		    }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		System.out.println("program continue............");
	}

}
