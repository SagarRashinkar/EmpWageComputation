class EmpWageComputation {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORK_DAYS_PER_MONTH = 20;

	public static void main(String[] args) {

	
		System.out.println("Welcome To Employee Wage Computation");

		int dailyWage = 0;
		int workHour = 0;
		int totalWage = 0;

		for(int i=0;i<WORK_DAYS_PER_MONTH;i++){
			
			int check = (int)Math.floor(Math.random()*10)%3;

			switch(check) {
	
				case 1:
					workHour = 8;
					break;
				case 2:
					workHour = 4;
					break;
				default:
					workHour = 0;
					break;

			}
			dailyWage = workHour * WAGE_PER_HOUR;
			totalWage += dailyWage;
			System.out.println("Daily wage of employee is :"+ dailyWage);
		}
		System.out.println("Monthly Wage is: "+totalWage);
	}
}
