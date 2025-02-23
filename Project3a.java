package ITSS3311Projects;
import java.util.*;
public class Project3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int turns=0;
		int playerScore=0;
		int computerScore=0;
		String playerMove;
		char computerMove = 0;
		double randomMove;
		Scanner input=new Scanner(System.in);
		while(turns<3&&playerScore!=2&&computerScore!=2)
		{
			System.out.println("Current score- Player: "+playerScore+" Computer: "+computerScore);
			System.out.println("Input your Rock, Paper, or Scissors move: ");
			playerMove=input.next().substring(0,1).toUpperCase();
			randomMove=(Math.random()*9)+1;
			if(randomMove>=1&&randomMove<=3)
			{
				computerMove='R';
			}
			else if(randomMove>=4&&randomMove<=6)
			{
				computerMove='P';
			}
			else if(randomMove>=7)
			{
				computerMove='S';
			}
			if(playerMove.equalsIgnoreCase("R"))
			{
				if(computerMove=='R')
				{
					System.out.println("Your Move: Rock");
					System.out.println("Computer's Move: Rock");
					System.out.println("Draw");
				}
				else if(computerMove=='S')
				{
					System.out.println("Your Move: Rock");
					System.out.println("Computer's Move: Scissors");
					System.out.println("Rock beats Scissors!");
					playerScore+=1;
					turns+=1;
				}
				else
				{
					System.out.println("Your Move: Rock");
					System.out.println("Computer's Move: Paper");
					System.out.println("Paper defeats Rock!");
					computerScore+=1;
					turns+=1;
				}
			}
			else if(playerMove.equalsIgnoreCase("P"))
			{
				if(computerMove=='R')
				{
					System.out.println("Your Move: Paper");
					System.out.println("Computer's Move: Rock");
					System.out.println("Paper defeats Rock!");
					playerScore+=1;
					turns+=1;
				}
				else if(computerMove=='S')
				{
					System.out.println("Your Move: Paper");
					System.out.println("Computer's Move: Scissors");
					System.out.println("Scissors cuts Paper!");
					computerScore+=1;
					turns+=1;
				}
				else
				{
					System.out.println("Your Move: Paper");
					System.out.println("Computer's Move: Paper");
					System.out.println("Draw.");
				}
			}
			else if(playerMove.equalsIgnoreCase("S"))
			{
				if(computerMove=='R')
				{
					System.out.println("Your Move: Scissors");
					System.out.println("Computer's Move: Rock");
					System.out.println("Rock beats Scissors!");
					computerScore+=1;
					turns+=1;
				}
				else if(computerMove=='S')
				{
					System.out.println("Your Move: Scissors");
					System.out.println("Computer's Move: Scissors");
					System.out.println("Draw");
				}
				else
				{
					System.out.println("Your Move: Scissors");
					System.out.println("Computer's Move: Paper");
					System.out.println("Scissors cuts Paper!");
					playerScore+=1;
					turns+=1;
				}
			}
			else
			{
				System.out.println("Invalid move. Try again");
			}	
		}
		input.close();
		if(playerScore>computerScore)
		{
			System.out.println("Final Score - Player: "+playerScore+" Computer: "+computerScore);
			System.out.println("Player won!");
		}
		else
		{
			System.out.println("Final Score - Player: "+playerScore+" Computer: "+computerScore);
			System.out.println("Player lost!");
		}
		

	}

}
