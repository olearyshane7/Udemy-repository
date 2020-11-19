package OOP;

public class CDaccount extends bankaccount implements IRate{
	String interestRate;
	
	void compount() {
		System.out.println("Coompounding interest");
	}

}
