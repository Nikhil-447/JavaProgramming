import java.util.*;

//Interface IcomputeWage
interface IComputeWage
{
	public void addCompany(String company,final int wagePerHour,final int numberOfDays,final int totalHours);
	public void computeEmpWage();
	public double getTotalWage(String company);
}



//Employee Wage Computation class

class CompanyEmpWage
{
 private  int wagePerHour;
    
    private  double totalWage;	
	private   int numberOfDays;
	private  int totalHours;
	private String Company;
    
    CompanyEmpWage(String Company,final int wagePerHour,final int numberOfDays,final int totalHours)
	{	this.Company=Company;
		this.wagePerHour=wagePerHour;
		
		this.numberOfDays=numberOfDays;
		this.totalHours=totalHours;
	}
    
    public void settotalWage(double totalWage)
    {
    this.totalWage=totalWage;
    }
    public double gettotalWage()
    {
    	return this.totalWage;
    }
    @Override
	public String toString()
	{
	return "Total Wage of the Person for the "+this.Company+" is "+this.totalWage;
	}
    public int getnumberOfDays()
    {
        return this.numberOfDays;
    
   }
   public int gettotalHours()
   { return this.totalHours;
   }
   public int getwagePerHour()
   {
	   return this.wagePerHour;
   }
   
}
	   
   


public class EmployeeWageComputation_UC_14 implements IComputeWage
{   
   private static int numOfCompanies=0;
   private ArrayList<CompanyEmpWage> CompanyWageList;
   private Map<String,CompanyEmpWage> companyToEmpWageMap;
 	EmployeeWageComputation_UC_14()
	{
	CompanyWageList=new ArrayList<CompanyEmpWage>();
	companyToEmpWageMap=new HashMap<String,CompanyEmpWage>();
	}
    public void addCompany(String company,final int wagePerHour,final int numberOfDays,final int totalHours)
    {
    CompanyEmpWage CompanyEmpWage_Obj=new  CompanyEmpWage(company,wagePerHour,numberOfDays,numberOfDays);
	CompanyWageList.add(CompanyEmpWage_Obj);
    numOfCompanies++;
    companyToEmpWageMap.put(company,CompanyEmpWage_Obj);
    }
    
    public void computeEmpWage()
    {
        for(int i=0;i<this.numOfCompanies;i++)
		{	CompanyEmpWage CompanyEmpWage_Obj=CompanyWageList.get(i);
         double totalWage=computeEmpWageHelper(CompanyEmpWage_Obj);
            CompanyWageList.get(i).settotalWage(totalWage);
			System.out.println(CompanyWageList.get(i));
        }
    }
    
    private double computeEmpWageHelper(CompanyEmpWage CompanyEmpWage_Obj)
    {//Declaring Random Class
		Random rand=new Random();
		//Genertaing random number in range [0,2]
		//1-Present
		//2-PartTime
		//0-Absent
		//Looping for 20 days
		double totalWage=0;
		int day=0;
		int fullDayHour=0;
		double wage=0;
		Map<Double, Double> total_dailyWage=new HashMap<Double, Double>();
		
		while(day<CompanyEmpWage_Obj.getnumberOfDays() && fullDayHour<=CompanyEmpWage_Obj.gettotalHours())
			
		{	
			
			final int ISPRESENT=rand.nextInt(3); 
			
			
			switch(ISPRESENT)
			{
				case 1:
							
							
								fullDayHour+=8;
								break;

			case 2:
			
						
						
							fullDayHour+=4;
							break;
			case 0:

						
						break;
			default:
						System.out.println("Invalid Value");
			}
			
			day+=1;
			
			wage=CompanyEmpWage_Obj.getwagePerHour()*fullDayHour;
			totalWage+=wage;
			
			total_dailyWage.put(wage,totalWage);
							
		}
	
		return totalWage;
		
		
	}
	
	public double getTotalWage(String company)
	
	{
		return companyToEmpWageMap.get(company).gettotalWage();
		
	}
	
  





	public static void main(String[] args) 
	
	{   //creating call objects
		EmployeeWageComputation_UC_14 e1 =new EmployeeWageComputation_UC_14();
		e1.addCompany("Reliance",30,30,120);
		e1.addCompany("Dmart",20,50,100);
		e1.computeEmpWage();
		System.out.println("The Total Wage for Dmart Company is "+e1.getTotalWage("Dmart"));

	}
}
