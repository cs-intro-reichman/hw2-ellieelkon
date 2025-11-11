// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		
		if (mode.equals("v")) {
			for (int i = 1; i <= seed; i++){
				int num = i;
				int count = 1;
				System.out.print(num + " ");
				do { 
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = num * 3 + 1;
				}
				System.out.print(num + " ");
				count++;	
				} while (num != 1);
					System.out.println("(" + count + ")");
			}
					System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
			} else if (mode.equals("c")) {
    		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}	 
	}
}
