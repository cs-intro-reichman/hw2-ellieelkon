// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]) ;
		double negative = 0 ;
		double positive = 0 ; 

		for (double i = 3.0 ; i <= num ; i += 4.0) {
			 negative = negative + (1.0 / i) ; }
		
		for (double j = 5.0 ; j <= num ; j += 4.0) {
			 positive = positive + (1.0 / j) ; }

		System.out.println("pi according to Java: " + Math.PI) ; 
		System.out.println("pi, approximated: " + (1 - negative + positive) * 4);
	}
}
