
public class Problem7 {
	public static void main(String[] args){
		
		// Generalized solution. Just enter the nth prime wanted. 
		int nthPrime = 10001;		// The nth prime value
		
		boolean found = false;
		int count = 1;			// Count variable for the while loop below
		long number = 2;		// The current number thats being evaluated
		
		while(!found){
			number++;
			
			if (isPrime(number)){
				count++;
				
			} 
			if (isPrime(number) && count == nthPrime){
				found = true;
			}
			
		}
		System.out.println(number);
	}
	
	
	
	
	/* A method to test if a number is a prime */
	public static boolean isPrime(long number){
		// Testing if number is even
		if (number % 2 == 0){
			return false;
		}
		// Testing if the number is divisible with an odd number
		for (int i = 3; i < Math.sqrt(number) + 1; i = i+2){
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
