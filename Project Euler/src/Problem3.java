
import java.lang.Math;
public class Problem3 {
	public static void main(String[] args){
		
		
		/* The prime factor won't be larger than the
		 * square root of the number   */
		long number = 600851475143L;
		long sqrtOfNumber = (long) Math.sqrt(600851475143L);
		
		/* Largest known prime factor */
		long largestfactor = 1;
		
		/* Testing if the number i divides number and 
		 * also if it is a prime */
		for (int i=1; i < sqrtOfNumber; i++){
			if (number % i == 0 && isPrime(i)){
				largestfactor = i;
			}
		}
		

		System.out.println(largestfactor);
		
		
	}
	
	/* A method to test if a number is a prime */
	public static boolean isPrime(long number){
		// Testing if number is even
		if (number % 2 == 0){
			return false;
		}
		// Testing if the number is divisible with an odd number
		for (int i = 3; i < Math.sqrt(number); i = i+2){
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
