public class EmpWageArray {
   //declaring the constants
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   private int numOfCompany = 0;
   private CompanyEmpWage[] companyEmpWageArray;


   public EmpWageArray(){
   companyEmpWageArray = new CompanyEmpWage[5];

   }

   public void addCompanyEmpWage(String company, int empRatePerHr, int maxNumOfWorkingDays, int maxHrsPerMonth ){
   companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,  empRatePerHr, maxNumOfWorkingDays, maxHrsPerMonth);
   numOfCompany++;
   }


   public void computeEmpWage(){
      for (int i=0; i<numOfCompany; i++){
         companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
         System.out.println(companyEmpWageArray[i]);
      }
   }

   private int computeEmpWage(CompanyEmpWage companyEmpWage){
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
		EmpWageArray dmart = new EmpWageArray("Dmart", 20, 20, 100);
		EmpWageArray samsung = new EmpWageArray("Samsung",25, 30, 130);
		dmart.calculateEmpWage();
		System.out.println(dmart);
		samsung.calculateEmpWage();
		System.out.println(samsung);

        }

}
