package udemy;

public class weather {
	public static void main(String[] args) {
		// program for suggestion on what to whear
		
		int temp = 65;
		String suncondition = "sunny";
		
		
		if (temp > 80) {
			System.out.println("pleasent wheter wear shorts");
			
		}
		else if (( temp > 60) && (suncondition == "sunny")) {
			System.out.println("little cooler wear pants");			
		}
		else if((temp > 50) || (suncondition == "sunny")){
		}
		else{
			System.out.println("looks cold bring sweater");
		}
	}
	
	
}
