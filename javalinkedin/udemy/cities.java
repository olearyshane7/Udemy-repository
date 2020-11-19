package udemy;

public class cities {

	public static void main(String[] args) {
		//Declare and define array, arrays start at 0
		String[] cities = {"New York","San Francicso", "Miami","Dallas"};
		System.out.println(cities[0]);
		
		//Declare array
		String[] countries;
		
		//define the array
		countries = new String[3];
		countries[0]="USA";
		countries[1]="U";
		countries[2]="US";
		System.out.println(countries[1]);
		
		System.out.println("0000");
		
		//declare and define array
		String[] states = new String[5];
		states[0]= "California";
		states[1]= "Califo";
		states[2]= "Califor";
		states[3]= "Californ";
		states[4]= "Californi";
		int i = 0;
		do {
			System.out.println(states[i]);
			i = i + 1;
		}while (i < 5);
		
		//while loop: test condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
				String state = states[n];
				System.out.println(state);
				if (state == "Californ") {
					System.out.println("satate Found");
					stateFound = true;
				}
				n++;
			}
		
	//for loop: best structure for iterating through an array
	for(int x = 0; x < 5; x++) {
		System.out.println(states[x]);
	}
	}
}
