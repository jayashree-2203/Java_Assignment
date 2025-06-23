package assignemnt_ExceptionHandling.bank;

public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(){
		super("Insufficient Balance");
	}
}