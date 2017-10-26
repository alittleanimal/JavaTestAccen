package day4;

public class Example {
	public static void main(String[] args) throws BankException {
		Bank bank = new Bank();
		try {
			bank.income(200, -100);
			bank.income(300, -100);
			System.out.println("money now: " + bank.getMoney());

			bank.income(200, 100);
			bank.income(9999, -100);

			System.out.println("money now: " + bank.getMoney());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("money now: " + bank.getMoney());
		
//		bank.income(200, -100);
//		bank.income(300, -100);
//		System.out.println("money now: " + bank.getMoney());
//
//		bank.income(200, 100);
//		bank.income(9999, -100);
//
//		System.out.println("money now: " + bank.getMoney());

	}
}
