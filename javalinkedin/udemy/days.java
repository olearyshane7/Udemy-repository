package udemy;

public class days {
	public static void main(String[] args) {
		String day = "Tuesday";
		
		//switches can only use one case variable
		//everything after the first execution executes unless the break command is implemented
		switch(day) {
		case "Monday" :
			System.out.println("today is monday");
		case "Tuesday" :
			System.out.println("today is tuesday");
			break;
		case "Wednesday" :
			System.out.println("today is wednesdauy");
			break;
			
		}
	}

}
