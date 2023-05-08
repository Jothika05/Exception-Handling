package Exception_handling;

public class throww {

  /*   static void method()throws ArithmeticException {
	      throw new ArithmeticException("method");
       }
     
     
 	public static void main(String[] args) {
    try {
    	method();
    }
    catch(ArithmeticException e) {
    	System.out.println("exception handlied");
    }  */
	
	static void div(int a,int b)throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
		public static void main(String[] args) {
			throww t=new throww();
			try {
			t.div(66, 0);
			}
			catch( ArithmeticException e) {
				System.out.println("pls check the divisor");
				t.div(6,3);
			}
}
}
