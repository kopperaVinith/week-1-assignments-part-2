import static java.lang.System.out;
import java.util.Scanner;

public class Assignment1Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		out.print("Enter the consumed units:");
		var unit_consumed = scanner.nextDouble();
		var energyCharge = 0d;
		var fixedcharge = 75.00;
		if(unit_consumed < 0)
		{
			out.println("Units cannot be negative");
		}
		else{
			if(unit_consumed < 100)
			{
				energyCharge = unit_consumed * 1.50;
			}
			else if( unit_consumed < 200)
			{
				energyCharge = 150 + ((unit_consumed - 100) * 2.50);
			}
			else if(unit_consumed < 500)
			{
				energyCharge = 400 + ((unit_consumed - 200) * 4.00);
			}
			else
			{
				energyCharge = 1600 + ((unit_consumed - 500) * 6.00);
			}
		}
		
		var subtotal = energyCharge + fixedcharge;
		var surcharge = 0d;
		if( subtotal > 1500.00)
		{
			surcharge = subtotal * 0.05;
		}
		
		var final_bill = energyCharge + fixedcharge + surcharge;
		out.printf("Energy charge: %.2f " , energyCharge);
		out.println();
		out.printf("Fixed Charge: %.2f " , fixedcharge);
		out.println();
		out.printf("Surcharge: %.2f " , surcharge);
		out.println();
		out.printf("Final bill: %.2f " , final_bill);
			
	}
}