import java.util.ArrayList;

public class Problem4 {
	public static void main(String[] args) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int largestPalindrome = 0;
		
		/*Testing the product of every number between 100 and 1000 */
		for(int i = 100; i < 1000; i++){
			for (int j = 100; j < 1000; j++){
				// The isPalindrome method tests if an integer is a palindrome
				if (isPalindrome(i*j) && i*j > largestPalindrome){			
						largestPalindrome = i*j;
						factors.add(0,i);
						factors.add(1,j);
				}
			}
		}
		System.out.println("Det största Palindromet är: " + largestPalindrome);
		System.out.println("Faktorerna är: " + factors.get(0) + " och " + factors.get(1));
	}
	
	
	
	/* Method for testing if a number is a palindrome */
	public static boolean isPalindrome(int num){
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int remainingNum = num;
		
		/* storing the individual digits of the number in an arraylist */
		while (remainingNum > 0){
			digits.add(remainingNum % 10);
			remainingNum /= 10;
		}
		/* Testing if the digits meets the criterion of being a palindrome */
		if (digits.size() == 6 && digits.get(0) == digits.get(5) 
		     && digits.get(1) == digits.remove(4) && digits.get(2) == digits.remove(3)){
			return true;
		}
		return false;
	}
}
