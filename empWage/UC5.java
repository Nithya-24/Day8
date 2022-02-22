package empWage;

public class UC5 {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int numberOfWorkingDays = 20;

	int empHrs = 0, empWage = 0, totalEmpWage = 0;
		
		/* 
		 * calculate Wages for 20 Days
		 */
		void empWageforTwentyDays() {
			
		for (int day = 1; day <= numberOfWorkingDays; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime:
				empHrs = 4;
				break;
			case isFullTime:
				empHrs = 8;
				break;	
				default:
					empHrs = 0;
			}
			empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			// System.out.println( "Emp Wage: " +empWage);
		
		}
		System.out.println("Total Emp Wage for 20 Days: " +totalEmpWage);
	
	}
}