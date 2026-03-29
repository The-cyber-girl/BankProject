package chatGpt_questions;

public class bankAccount {
	
	String ownerName;
	double balance;
	
	bankAccount(String ownerName, double balance){
		this.ownerName = ownerName;
		this.balance= balance;
	}
	bankAccount(String ownerName){
		this.ownerName = ownerName;
		this.balance= 0;
	}
	 void deposit(double amount) {
		 balance = balance +amount;
	 }
	 void withdraw(double amount) {
		 if  (amount>balance ) {
			 System.out.println("NOT ENOUGH MONEY");
		 }else {
		 balance = balance - amount;
	 }
	 }
	
	void displayBalance() {
		System.out.println(ownerName +" balance:" +balance + "$");
	}
}
