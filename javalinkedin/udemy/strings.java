package udemy;

public class strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if(bookTitle.contains(wordChoice)) {  //contains boolean
			System.out.println("the book contains the word" + wordChoice);
			
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("browser chrome");
		}
		
		String firstName = "Shane";
		String lastName = "OL";
		String SSN = "1243235354";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(6));
		

	}

}
