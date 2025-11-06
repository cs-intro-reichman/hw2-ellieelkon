// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int total = Integer.parseInt(args[0]) ;
		int counted = 1 ;
		int start = 3 ; 
		double negative = 0 ;
		double positive = 0 ; 

		while (counted < total) {
			negative += 1.0 / start ;
			counted++ ;
			
			if (counted >= total) break ; 
			
			positive += 1.0 / (start + 2) ;
			counted++ ;
			
			start += 4 ;
		}

		System.out.println("pi according to Java: " + Math.PI) ; 
		System.out.println("pi, approximated:     " + ((1 - negative + positive) * 4));
	}
}
