package Exception_handling;

import java.util.InputMismatchException;

public class ExceptionBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception2 ex=new  exception2();
	    //ex.call(); 
		
		 try {
			 ex.call();
			 }
			 catch(InputMismatchException e) {
				 System.out.println("give only number:");
			 }
			 catch(ArithmeticException e)
				{
					System.out.println("please check your divisor");
				 ex.call();
				}  
			 
		//ExceptionBasics2 ex1=new ExceptionBasics2();
		// ex1.dis();
	
	}

/*
	private void dis()throws Exception {
		// TODO Auto-generated method stub
		 exception2 ex=new  exception2();
	     ex.call();
	} */
}
