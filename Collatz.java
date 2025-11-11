// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		//String mode = args[1];
		int count = 0;
		int mode = Integer.parseInt(args[1]); 
		int N = 0	
		
		do { 
			if (N % 2 == 0) {
				N /= 2;
			} else {
				N = N * 3 + 1;
			}
			count++;
		} while (N < 1 && N >= seed);

		System.out.println(count);

		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");



	}
}
