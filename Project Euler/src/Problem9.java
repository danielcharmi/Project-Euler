
public class Problem9 {
	public static void main(String[] args){
	
		for (int a = 0; a < 333; a++){		// 1000 / 3 = 333
			for(int b = 1; b < 500; b++){	// 1000/ 2 = 500
					int c = 1000 - b - a;
					if (a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
						System.out.println("a = " + a + " b = " + b + " c = " + c);
						System.out.println("Product = " + a*b*c);
				}
				
			}
			
		}
	}
}


/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/