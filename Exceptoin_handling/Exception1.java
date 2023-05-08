package Exceptoin_handling;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
             System.out.println(5/0);
	     }
		catch(NullPointerException e) {
			 System.out.println("infinity");
			 System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
             System.out.println(e.getMessage());
		}
		finally {
		 System.out.println("inside finally");
		}
		 System.out.println("outside finally");

	}

}
