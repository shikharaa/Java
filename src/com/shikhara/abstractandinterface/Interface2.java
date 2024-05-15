package com.shikhara.abstractandinterface;

interface Account{
	
	void deposit(double amount);
	void withdraw(double amount);
	double calculateInterest();
	void view_balance();
}

class Bank{
	
}




class SavingsAccount implements Account{
	
	public void deposit(double amount) {
		
	}
		
	public void withdraw(double amount) {
		
	}
	
	public double calculateInterest() {
		return 0;
	}
	public void view_balance() {

	}

	
}


class CurrentAccount{
	
public void deposit(double amount) {
		
	}
		
	public void withdraw(double amount) {
		
	}
	
	public double calculateInterest() {
		return 0;
	}
	public void view_balance() {

	}

	
	
}




public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
