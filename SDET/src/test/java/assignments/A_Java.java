package assignments;

class Account{
	double interest;
	double balance;
	public Account(double interest, double balance) {
		super();
		this.interest = interest;
		this.balance = balance;
	}
	
	public void calculateInterest() {
		double calculatedInterest = balance*(interest/100);
		System.out.println("Interest calcualted is : "+calculatedInterest);
	}
	
	public void displayBalance() {
		System.out.println("Account balance is : "+balance);
	}
}

class SavingsAccount extends Account{
	
	public SavingsAccount(double interest, double balance) {
		super(interest, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateInterest() {
		double calculatedInterest = balance*(interest/100);
		System.out.println("Interest calcualted is : "+calculatedInterest);
	}
	
	public void displayBalance() {
		System.out.println("Account balance is : "+balance);
	}
}

class CurrentAccount extends Account{
	
	public CurrentAccount(double interest, double balance) {
		super(interest, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateInterest() {
		double calculatedInterest = balance*(interest/100);
		System.out.println("Interest calcualted is : "+calculatedInterest);
	}
	
	public void displayBalance() {
		System.out.println("Account balance is : "+balance);
	}
}

public class A_Java {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(300,6);
		sa.displayBalance();
		sa.calculateInterest();
		
		CurrentAccount ca = new CurrentAccount(6000,12);
		ca.displayBalance();
		ca.calculateInterest();
	}
}
