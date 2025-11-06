//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0] ;
                String upper = word.toUpperCase() ;
                int repetition = Integer.parseInt(args[1]) ;

                for (int i = 0; i < upper.length(); i++) {
                        if (upper.charAt(i) == 'A' || upper.charAt(i) == 'E' || upper.charAt(i) == 'F' || upper.charAt(i) == 'H' 
                                || upper.charAt(i) == 'I' || upper.charAt(i) == 'L' || upper.charAt(i) == 'M' ||upper.charAt(i) == 'N' 
                                ||upper.charAt(i) == 'O' ||upper.charAt(i) == 'R' || upper.charAt(i) == 'S' || upper.charAt(i) == 'X') {
                                System.out.println("Give me an " + upper.charAt(i) + ": " + upper.charAt(i) + "!") ;
                        } else {
                                System.out.println("Give me a  " + upper.charAt(i) + ": " + upper.charAt(i) + "!") ; }
                        }

                System.out.println("What does that spell?");
                
                for (int j = 0; j < repetition; j++) {
                        System.out.println(upper + "!!!");
                }        
        }
}
