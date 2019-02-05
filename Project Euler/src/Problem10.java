
public class Problem10 {
	public static void main(String[] args){
		long sum = 5;  						// Already summed 2 + 3 = 5
		for (int i = 4; i < 2000000; i++){  // Searching for primes between 4 and 2 million
			if (isPrime(i)){
				sum += i;
			}
		}
		System.out.println(sum);
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
/* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million. */