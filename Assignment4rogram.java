import static java.lang.System.out;
import java.util.Scanner;

public class Assignment4rogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		out.print("Enter the starting number: ");
		var start = scanner.nextInt();
		out.print("Enter the ending number: ");
		var end = scanner.nextInt();
		var amstrongCount = 0;
		out.print("Amstrong numbers: ");
		if(start < 0 || end < 0)
		{
			out.println("Number should be positive");
		}
		else
		{
			for(int i = start; i <= end; i++)
			{
				if(isAmstrong(i)){
					out.print(i + " ");
					amstrongCount++;
				}
			}
		}
		out.println();
		out.println("Number of Armstrong numbers: "+amstrongCount);
	}
	
	public static boolean isAmstrong(int num)
	{
		if (num == 0) return true;
		var originalNum = num;
		var sum = 0;
		var digits = 0;
		var temp = num;		
		
		while(num > 0)
		{
			num /= 10;
			digits++;
		}
		while(temp > 0)
		{
			int digit = temp % 10;
			sum += Math.pow(digit , digits);
			temp /= 10;
		}
		return sum == originalNum;
	}
}
			
		
		
			
			