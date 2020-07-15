public class EmpCheckUC5{
   //declaring the constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int TOTAL_WORK_DAYS = 20;

	public static void main(String[] args){
		//declaring variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		// calculating part & full time Working Hours
		for (int day = 1; day <= TOTAL_WORK_DAYS; day ++) {
		int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
		switch (empCheck) {
		   case IS_PART_TIME:
			empHrs = 4;
			break;
		   case IS_FULL_TIME:
			empHrs = 8;
			break;
		   default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Day" + day + ">>" +"Wage:" + empWage );
	  }
	System.out.println("Total Monhtly Wage: "+totalEmpWage);
	}
}
