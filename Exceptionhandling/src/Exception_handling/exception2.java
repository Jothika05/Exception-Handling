package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 exception2 ex=new  exception2();
		ex.getdetails();
		//ex.display();
	     //	ex.call();
		// ex.cal();
		    
	}

	private void display() {
		// TODO Auto-generated method stub
		try {
		int no1=10,no2=0,no3=-5;
		int[] arr=new int[no3];
		 System.out.println(no1/no2);
	}
		catch(ArithmeticException | NegativeArraySizeException e) {
			System.out.println(e.getMessage());
			System.out.println("check ..check");
		}
	}
	private void getdetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
	        System.out.println("enter Account number:");
	        int acc=sc.nextInt();
	        System.out.println("enter PIN number:");
	        int pin=sc.nextInt();
	        System.out.println("enter array length:");
	        try {
	              int no=sc.nextInt();
	              int[] empDetails=new int[no];
		          for(int i=1;i<empDetails.length;i++) {
			         empDetails[i]=20000;
		             }
		          System.out.println(acc/pin);
		        }
	        catch(NegativeArraySizeException e) {
	    	 
				System.out.println("Array length should be positive");
				}   
		    }
		catch(InputMismatchException e){
			 // e.printStackTrace();
			 
			  System.out.println("check your acc no &pin no.");
			getdetails();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("check your array length.");
		
		}
		catch(ArithmeticException e) {
			// System.out.println(e.getMessage());
		}
				
		finally{
			System.out.println("close transcation");
	    }
	}
	
	//throws methods
		public void call() throws ArithmeticException,InputMismatchException {
			// TODO Auto-generated method stub
			    Scanner sc=new Scanner(System.in);
			    System.out.println("enter two number:");
			    int a=sc.nextInt();
			    int b=sc.nextInt();
			    System.out.println(a/b);
			    
		}	    
			    
	  public void cal() throws Exception{
			// TODO Auto-generated method stub
			    Scanner sc=new Scanner(System.in);
			    System.out.println("enter two number:");
			    int a=sc.nextInt();
			    int b=sc.nextInt();
			    System.out.println(a/b);   
			    

	}
	
}