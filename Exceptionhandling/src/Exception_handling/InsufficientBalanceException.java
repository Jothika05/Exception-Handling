package Exception_handling;

public class InsufficientBalanceException extends Exception {
	int amount;
	InsufficientBalanceException(int awt){
	 amount=awt ;
	}
}
