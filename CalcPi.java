// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]) ;
		int counted = 1 ;
		double total = 0;
		int i = 1;

		while (i <= num) {
			double a = 1 / num;
			
			if (i % 2 == 0){
				total = total - a;
			} else {
				total = total + a;
			}
			i++;
			counted = counted + 2;
		}

		System.out.println("pi according to Java: " + Math.PI) ; 
		System.out.println("pi, approximated:     " + (total * 4));
	}
}
