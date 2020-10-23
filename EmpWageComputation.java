class EmpWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome To Employee Wage Computation");

		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int dailyWage = 0;
		int workHour = 0;

		int check = (int)Math.floor(Math.random()*10)%3;

		switch(check) {

			case 1:
				workHour = 8;
				System.out.println("Employee is Full Time");
				break;
			case 2:
				workHour = 4;
				System.out.println("Employee is Part Time");
				break;
			default:
				workHour = 0;
				System.out.println("Employee is Not Present");
				break;

		}

		dailyWage = workHour * WAGE_PER_HOUR;
		System.out.println("Daily wage of employee is :"+ dailyWage);
	}
}
