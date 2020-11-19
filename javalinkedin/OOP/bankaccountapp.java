package OOP;

public class bankaccountapp {

	public static void main(String[] args) {
		// creating a new bank account
		
		bankaccount acc1 = new bankaccount();
		
		//encapsulation
		acc1.setName("Shane");
		System.out.println(acc1.getName());
		
		
		
		acc1.accountNumber = "234234223";
		acc1.name= "Shane";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		System.out.println(acc1.toString());
		
		acc1.deposit(1500);
		acc1.deposit(4000);
		acc1.withdraw(2000);
		
		
		bankaccount acc2 = new bankaccount("Checking account");
		acc2.accountNumber = "2143243224";
		
		
		bankaccount acc3 = new bankaccount("deposited ", 5000);	
		acc3.accountNumber = "324242424";
		acc3.checkBalance();
		
		
		//demo for inheritance
		//CDaccount cd1 = new CDaccount();
		//cd1.name = "juan";
		//cd1.accountType = "cd account";
		//System.out.println(cd1.toString());
		//cd1.compount();
		

	}

}
