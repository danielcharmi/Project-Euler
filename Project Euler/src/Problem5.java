
public class Problem5 {
	public static void main(String[] args){
		boolean found = false;
		int number = 1;	// The divisible number 
		int count = 0;	// An integer to keep track of the successful divisions
		
		/* As long as the number isn't found, the while loop will keep going  */
		while(!found){
			for(int i = 1; i <= 20; i++){
				if (number % i == 0){
					count++;	// Successful division means +1 to count
				} else {		
					break;		// If not successful we can just break the for loop	
				}				
			}
			if (count == 20){	// Testing if the number of even divisions is 20
				found = true;
			}
			/* If above test is not successful then we start over
			 * by reseting count and moving on to the next number */
			count = 0;		
			number++;
		
		}
		System.out.println(number - 1);
	}
}
