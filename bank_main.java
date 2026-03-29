package chatGpt_questions;

public class bank_main {

	public static void main(String[] args) {
		
		bankAccount fatimAccount = new bankAccount("fatima" ,500);
		fatimAccount.deposit(200);
		fatimAccount.withdraw(1000);
		fatimAccount.displayBalance();



	}

}
