
public class Problem2 {
	public static void main(String[] args){
		
		/* Genererar fibonaccitalen i en while loop */
		/* Testar sen om varje ny term (currentFib) är jämt eller inte */
		
		int currentFib = 2; //Börjar generara från andra fibonaccitalet
		int previousFib = 1; //Det här är första fibonaccitalet
		int sum = 0;
		
		while(currentFib < 4000000){
			if (currentFib % 2 == 0) {
				sum += currentFib;		//om currentFib är jämt läggs det till i summan
			}
			int temp = currentFib;
			currentFib = previousFib + currentFib;
			previousFib = temp;
			
		}
		
		System.out.println(sum);
		
	}
	
	
	
}
