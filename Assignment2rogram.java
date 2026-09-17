import static java.lang.System.out;
import java.util.Scanner;

public class Assignment2rogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		out.print("Enter the age: ");
		var age = scanner.nextInt();
		out.print("Enter Monthly income: ");
		var income = scanner.nextDouble();
		out.print("Enter the credit score: ");
		var creditscore = scanner.nextInt();
		out.print("Enter the existing EMI: " );
		var existing_EMI = scanner.nextDouble();
		out.print("Enter the proposed EMI: " );
		var proposed_EMI = scanner.nextDouble();
		var combined_EMI = existing_EMI + proposed_EMI;
		var combined_percentage = (combined_EMI / income ) * 100;
		
		if(age < 0 || income < 0 || existing_EMI < 0 || proposed_EMI < 0)
		{
			out.println("Numbers should not be negative.");
		}
		else
		{
			out.printf("Combined EMI percentage: %.2f%%%n",combined_percentage);
			if(age < 21 || age > 60)
			{
				out.println("Your not Eligible for loan.");
			}
			else if(income < 25000 )
			{
				out.println("Your not Eligible for loan.");
			}
			else if(creditscore < 650 )
			{
				out.println("Your not Eligible for loan.");
			}
			else if(combined_EMI > (income * 0.4))
			{
				out.println("Your not Eligible for loan.");
			}
			else
			{
				out.println("Loan status : Eligible");
				if(creditscore >= 750)
				{
					out.println("Applicable annual interest rate: 8.5%");
				}
				else if(creditscore >= 700)
				{
					out.println("Applicable annual interest rate: 10.0%");
				}
				else
				{
					out.println("Applicable annual interest rate: 12.0%");
				}
			}
		}
	}
}
				
				