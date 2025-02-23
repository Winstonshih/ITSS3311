package ITSS3311Projects;

public class Project3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sales=0;
		double adSpending=1;
		double randomShock = Math.random();
		double totalSales=0;
		double totalAdSpending=0;
		for(int i=0;i<4;i++)
		{
			totalAdSpending+=adSpending;
			totalSales+=sales;
			sales=(sales+0.1*Math.sqrt(adSpending*(1-sales))+0.1*sales*(1-sales)*randomShock);
		}
		System.out.printf("Plan A: The total sales are $%.2f and the total spending is $%.2f.\n", totalSales,totalAdSpending);
		sales=0;
		adSpending=1;
		totalSales=0;
		totalAdSpending=0;
		for(int i=0;i<4;i++)
		{
			totalSales+=sales;
			totalAdSpending+=adSpending;
			adSpending=0.5*(1-sales);
			sales=(sales+0.1*Math.sqrt(adSpending*(1-sales))+0.1*sales*(1-sales)*randomShock);
		}
		System.out.printf("Plan B: The total sales are $%.2f and the total spending is $%.2f.", totalSales,totalAdSpending);

	}

}
