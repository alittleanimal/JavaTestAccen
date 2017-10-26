package day4;

public class BankException extends Exception {

	String message;

	public BankException(int m, int n) {
		message = "in"+m+"out"+n+"not correct";
	}

	public String warnMess() {
		// TODO Auto-generated method stub
		return message;
	}

}
