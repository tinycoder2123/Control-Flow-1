/**************************************************
 * Module 2
 * Assignment 1
 * By Karolina Szulczyk
 * 
 ***************************************************/

package EconomicPolicy;
import java.util.Scanner;
public class Policy
{
	public static void main(String[] args)
		{
					Scanner stdIn = new Scanner(System.in);
							float growthRate; // Annual Growth Rate
							float inflation;		// Inflation		
					System.out.print("ECONOMIC POLICY" + "\n\n");	 				// Title
					System.out.println("What is the annual growth rate ? ");		//Question 
					growthRate =  stdIn.nextFloat();
					System.out.println("What is the inflation rate ? ");				//Question
					inflation =  stdIn.nextFloat();
					
				if (growthRate < 1.0)
				{
					if (inflation < 3.0)
					{
					System.out.println(
						"Recommended economic policy is:" + "\n" + 
						"Increase welfare spending" + "\n" + 
						"educe personal taxes" + "\n" +
						"and decrease discount rate.");
					} 
						else 
						{
						System.out.println("Recommended economic policy is: Reduce business taxes");
						}
				}
				else if (growthRate > 4.0)
				{
					if (inflation < 1.0)
					{
					System.out.print("Recommended economic policy is:" + "\n" +
												"Increase personal and business taxes, " + "\n" + 
												"and decrease discount rate. ");
					 
				}
				else if (inflation > 3.0)
					{
					System.out.print("Recommended economic policy is: " + "\n" +
																"Increase discount rate");
					} 
				else{
						System.out.print("No change in economic policy");
						}
				}
	}// end main
}// end Economic Policy
