package SD;

public class StudentDB {

	public static void main(String[] args) {
		
		studentID id1 = new studentID("63475467");
		
		id1.setName("Shane");
		System.out.println(id1.getName());
		id1.showBalance(50000);
		
		id1.showBalance(40000);
		
		id1.showBalance(5000);
		
		

		
	}


}

class studentID {
	private static int StudentID;
	private String StudentEmail;
	private String StudentName;
	private String SSN;
	private String Studentaccount;
	private double balance;
	private double amount;
	private String courses;

	
	public studentID(String SSN){
		this.SSN = SSN;
		setStudentAccount();
	}
	
	private void setStudentAccount() {
		int StudentID = (int)(Math.random())*10000;
		Studentaccount = (StudentID + "" + SSN.substring(4,8));
		System.out.println("Student account: " + Studentaccount);
	}
	
	public void setName(String StudentName) {
		this.StudentName = StudentName;
	}
	
	public String getName() {
	
		return StudentName;
	}
	
	public void balance1(double balance) {
		System.out.println("Starting Balance: "+ balance);
		balance = amount;
		showBalance(balance);
		
	}

	public void amount(double amount) {
		System.out.println("Enrollment fee: " + amount);
		balance = amount - balance;
		showBalance(amount);
		
	}
	
	public void pay(double amount) {
		System.out.println("Balance after first enrollment fee: " + amount);
		balance = balance - amount;
		showBalance(balance);
	}
	
	public void showBalance(double balance) {
		System.out.print(balance);
		
		
	}
	public void courses(String courses) {
		courses = "english101/n" + "math202/n" + "philosophy110/n" + "programming410/n";
		System.out.println(courses);
		
		
	}
	public String toString(String StudentEmail) {
		StudentEmail = StudentName + StudentID;
		return (StudentEmail);
			
	}
	
	
	
	
}