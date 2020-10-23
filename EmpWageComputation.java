class EmpWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome To Employee Wage Computation");

		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR = 20;
		int dailyWage = 0;
		int workHour = 0;
		double check = Math.floor(Math.random()*10)%2;

		if(check == IS_FULL_TIME) {

			workHour = 8;
		}
		else {

			workHour = 0;
		}
		dailyWage = workHour * WAGE_PER_HOUR;
		System.out.println("Daily wage of employee is :"+ dailyWage);
	}
}

