package quiz1;

import java.util.Scanner;

public class QBstats {
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Please enter total number of touchdowns: ");
		double TD = sc.nextDouble(); //gets number of touchdowns and assigns to variable: touchdowns
		
		System.out.print("Please enter total number of yards: ");
		double Yards = sc.nextDouble();		//gets number of yards and assigns to variable yards
		
		System.out.print("Please enter total number of interceptions: ");
		double INT = sc.nextDouble(); //gets number of interceptions and assigns to variable interceptions
		
		System.out.print("Please enter total number of completions: ");
		double COMP = sc.nextDouble(); //gets number of completions and assigns to variable completions
		
		System.out.print("Please enter total number of attempted passes: ");
		double ATT = sc.nextDouble(); //gets number of attempts and assigns to variable passes_attempted
		
		
		//Calculations for variables used in formula for  QB rating
		double a = ((COMP/ATT )-.3) * 5; 
		double b = ((Yards/ATT)-3)* .25;
		double c = ((TD/ATT)* 20 );
		double d = (2.375 - ((INT/ATT)*25));
		
		double QB_Rating = ((a + b + c + d)/6)*100; //calculates QB rating
		
		//Prints out QB rating
		System.out.printf(" The rating for this player is: %.1f ", QB_Rating);
				
	}
}