package udemy;

public class salcalc {
	public static void main(String[] args) {
	//create variable in career
	//declare variable
	String career;
	System.out.println("program starting");
	
	//defined variable
	career = "software Developer";
	System.out.println("My career" + career);
	
	//declare and define
	int hoursperweek = 40;
	int weeksperyear = 50; 
	double rate = 42.50;
	//double for decimal
	
	//compute salary
	double salary = hoursperweek * weeksperyear * rate;
	System.out.println("my salary is " + salary);
	
	}

}
