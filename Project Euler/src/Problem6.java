import java.lang.Math;


public class Problem6 {
	public static void main(String[] args){
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for (int i = 0; i <= 100; i++){
			sumOfSquares += Math.pow(i, 2);
		}
		for (int i = 0; i <= 100; i++){
			squareOfSums += i;
		}
		squareOfSums = (int) Math.pow(squareOfSums,2);
		System.out.println(squareOfSums - sumOfSquares);
	}
}