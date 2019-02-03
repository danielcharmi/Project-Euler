
public class Problem1 {
	
	public static void main(String[] args){
		
		int sum = 0;
		
		/* Använder modulus för att identifiera multiplar av 3 och 5 */
		for (int i=0; i < 1000; i++){
			if (i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

		
}
	
