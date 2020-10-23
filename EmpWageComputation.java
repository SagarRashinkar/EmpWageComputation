class EmpWageComputation {

	public static void main(String[] args) {

		System.out.println("Welcome To Employee Wage Computation");

		int IS_FULL_TIME = 1;
		double check = Math.floor(Math.random()*10)%2;

		if(check == IS_FULL_TIME) {

			System.out.println("Employee is present");
		}
		else {

			System.out.println("Employee is not present");
		}
	}
}

