package empWage;

public class UC6 {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int numberOfWorkingDays = 20;
	public static final int hoursInMonth = 100;
	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	
	void empDetail() {
		while( totalEmpHrs <= hoursInMonth && totalWorkingDays< numberOfWorkingDays) {
			totalWorkingDays++;
			
			/*
			 * Calculate Wages for 100 Working Hrs
			 */

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
			
				totalEmpHrs += empHrs;
				// System.out.println( "Day: " + totalWorkingDays + " Emp Hr: "+empHrs);
						}	
	

				
			
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for 100 Working Hrs: " +totalEmpWage);
	}
}
	
