package empWage;

public class UC2 {

	public static void main(String[] args) {
		int ratePerHour = 20;
		int isFullTime = 1;
		int empHour = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime) {
			empHour = 8;
		} else {
			empHour = 0;
		}
 		
		
		empWage = ratePerHour * empHour;
		
		System.out.println( " Employee Daily Wage per day is: " +empWage);
	}

}
