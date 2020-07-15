public class EmpWageCheckUC7{
   //declaring the constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int TOTAL_WORK_DAYS = 20;
	public static final int MAX_WORK_HRS=100;

	public static  int calculateEmpWage(){
		//declaring variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		// calculating part & full time Working Hours
		while (totalEmpHrs<MAX_WORK_HRS && totalWorkingDays<TOTAL_WORK_DAYS){
			totalWorkingDays++;
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
		totalEmpHrs += empHrs;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Day:" + totalWorkingDays +" Hours:" + totalEmpHrs + ">>" +" Wage:" + empWage );
	  }
		System.out.println("Total Monhtly Wage: "+totalEmpWage);
		return 0;
	}

	public static void main(String[] args){
		calculateEmpWage();
	}

}
