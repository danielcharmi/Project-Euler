
public class Problem12 {
	public static void main(String[] args){
		
		boolean found = false;
		int n = 1;
		
		while(!found){
			n++;
			int triangelNum = n*(n+1)/2;	// Analytical formula for the nth triangel number
			
			if (divisors(triangelNum) > 500){
				System.out.println(triangelNum);
				found = true;
			}
		}
	}
	
	
	/* Method to find the number of divisors of an integer */
	public static int divisors(int number){
		int divisorCount = 2;	// Starting at 2
		for(int i = 2; i < Math.sqrt(number) + 1; i++){
			if (number % i == 0){
				divisorCount += 2;		
			}
		}
		if (number % Math.sqrt(number) == 0){
			divisorCount--;
		}
		return divisorCount;
	}
}
