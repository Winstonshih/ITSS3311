package ITSS3311Projects;
import java.util.*;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monthlyInterest, futureInvestment, initialValue, annualInterest;
		int months, years;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the investment amount: ");
		initialValue=input.nextDouble();
		System.out.println("Enter the annual interest: ");
		annualInterest=input.nextDouble();
		System.out.println("Enter the number of years: ");
		years=input.nextInt();
		input.close();
		//Step 2. Compute number of months and monthly interest.
		months=years*12;
		monthlyInterest=annualInterest/1200;
		//Step 3. Compute the future investment value: futureInvestmentValue=investmentAmount*(1+monthlyInterest)^months.
		futureInvestment=initialValue*Math.pow(
		(1+monthlyInterest), months);
		//Step 4. Display the investment amount, annual interest rate, and future investment value.
		System.out.printf("The investment amount is $%4.2f.",initialValue);
		System.out.printf("\nThe annual interest rate is %1.2f%%.", annualInterest);
		System.out.printf("\nThe future investment value is $%4.2f after %d years.", futureInvestment, years);

	}

}
