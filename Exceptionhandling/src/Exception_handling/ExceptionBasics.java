package Exception_handling;

import java.util.Scanner;

public class ExceptionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    ExceptionBasics eh=new ExceptionBasics();
    eh.calculator();
    
    
  }

	private void calculator() {
		// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter two number:");
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    System.out.println(a+b);
		    System.out.println(a-b);
		    System.out.println(a*b); 
		    try {
		   System.out.println(a/b);
	    }
		catch(ArithmeticException e)
		{
			System.out.println("please check your divisor");
			calculator();
		} 
 
}
}