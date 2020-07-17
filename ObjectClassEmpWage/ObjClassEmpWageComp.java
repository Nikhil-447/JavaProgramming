public class ObjClassEmpWageComp {
   //declaring the constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   //public static final int EMP_RATE_PER_HOUR = 20;
   //public static final int TOTAL_WORK_DAYS = 20;
   //public static final int MAX_WORK_HRS=100;

        public static  int ObjClassEmpWageComp(String company, int empRatePerHr, int maxNumOfWorkingDays, int maxHrsPerMonth ){
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxNumOfWorkingDays = maxNumOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;

                //declaring variables
                int empWage = 0;
                int totalEmpWage = 0;
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
                // calculating part & full time Working Hours
                while (totalEmpHrs < maxHrsPerMonth && totalWorkingDays < maxNumOfWorkingDays) {
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
                empWage = empHrs * empRatePerHr;
                totalEmpWage += empWage;
                System.out.println("Day:" + totalWorkingDays +" Hours:" + empHrs + ">>" +" Wage:" + empWage );
          }
                System.out.println("For Company:"+company+ " Monthly Work Hours of Emp:" +totalEmpHrs+ " & " +"Monhtly Wage of Emp: "+totalEmpWage);
                return 0;
        }

	@Override
	public String toString(){
	   return "total emp wage for company:"  +company+ " is " + totalEmpWage;
	}
        public static void main(String[] args){
		ObjClassEmpWageComp dmart = new ObjClassEmpWageComp("Dmart", 20, 20, 100);
		ObjClassEmpWageComp samsung = new ObjClassEmpWageComp("Samsung",25, 30, 130);
		dmart.calculateEmpWage();
		System.out.println(dmart);
		samsung.calculateEmpWage();
		System.out.println(samsung);

        }

}
