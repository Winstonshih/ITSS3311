package ITSS3311Projects;
import java.util.*;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Please input your name such as George Elliot. Don’t input your middle name. ");
		String name = input.nextLine();
		int space=name.indexOf(' ');
		String lastName=name.substring(space+1);
		System.out.println("Enter \"send\" to send a package or \"find\" to find a package. ");
		String status = input.nextLine();
		if(status.equals("send"))
		{
			System.out.println("Enter the weight of your package: ");
			int weight = input.nextInt();
			double costShipping=0;
			if(weight<=0) {
				System.out.println("The weight is not valid");
			}
			else if(weight>0&&weight<=15)
			{
				costShipping=3.75+weight*1.25;
				System.out.println(name+", you need to pay "+costShipping+" dollars.");
			}
			else if(weight>15&&weight<=25)
			{
				costShipping=8.50+(weight-7)*1.75;
				System.out.println(name+", you need to pay "+costShipping+" dollars.");
			}
			else if(weight>25&&weight<=40)
			{
				costShipping=10.75+(weight-12)*2.25;
				System.out.println(name+", you need to pay "+costShipping+" dollars.");
			}
			else {
				System.out.println(name+", the package cannot be shipped.");
			}
		}
		input.close();
		if(status.equals("find"))
		{
			if(Character.isLowerCase(lastName.charAt(0)))
			{
				System.out.println("The first letter of the last name has to be capitalized.");
			}
			else if(lastName.charAt(0)=='A')
			{
				System.out.println(name+", your package is on Warehouse 1");
			}
			else if(lastName.charAt(0)=='B')
			{
				System.out.println(name+", your package is on Warehouse 1");
			}
			else if(lastName.charAt(0)=='C')
			{
				System.out.println(name+", your package is on Warehouse 1");
			}
			else if(lastName.charAt(0)=='D')
			{
				System.out.println(name+", your package is on Warehouse 1");
			}
			else
			{
				System.out.println(name+", your package is on Warehouse 2");
			}
		}
		

	}

}
