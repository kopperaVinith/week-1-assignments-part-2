import static java.lang.System.out;
import java.util.Scanner;

public class Assignment3rogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		out.print("Enter the starting number: ");
		var start = scanner.nextInt();
		out.print("Enter the ending number: ");
		var end = scanner.nextInt();
		if(start > end )
		{
			out.println("The starting number must not be greater than the ending number");
		}
		
		var primeCount = 0;
		var primeSum = 0;
		out.print("Prime Numbers:");
		for(int i = start; i <= end; i++)
			{
				if(i < 2 )
				{
					continue;
				}
				boolean isPrime = true;
				for(int divisor = 2; divisor <= Math.sqrt(i); divisor++)
				{
					if(i % divisor == 0)
					{
						isPrime = false;
						break;
					}
				}
				if(isPrime)
				{
					out.print(i + " ");
					primeCount++;
					primeSum += i;
				}
	
		    }
		 out.println();
		 out.println("Number of Primes:" + primeCount);
		 out.println("Sum of Primes:" + primeSum);
	}
}
	
			