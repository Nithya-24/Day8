package empWage;

public class UC3 {

	public static void main(String[] args) {
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHour = 20;
		int empHrs = 0;
		int empwage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) %3;
		
		if (empCheck == isPartTime) {
			empHrs = 4;
		}
		else if (empCheck == isFullTime) {
			empHrs = 8;
		}
		else {
			empHrs = 0;
		}
			empwage = empHrs * empRatePerHour;
			System.out.println( "Emp Wage: " +empwage);
		}
		
}