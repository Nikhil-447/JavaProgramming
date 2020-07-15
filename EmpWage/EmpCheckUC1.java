
//The Employee Check class

public class EmpCheckUC1 {

   private static final int IS_FULL_TIME=1;

   public static void main(String args[]){

   //calling function

   empCheck();

   }

//function body check the employee attendance

   public static void empCheck(){

      double randNumber = Math.floor(Math.random() * 10 ) % 2;

      if(IS_FULL_TIME==randNumber){

      System.out.println("Employee is Present");


      } else {

      System.out.println("Employee is Absent");

      }
   }
}


