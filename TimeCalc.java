public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0] ;
        int MinutesToAdd = Integer.parseInt(args[1]) ;

		int Hours = Integer.parseInt(time.substring(0,2)) ;
		//System.out.println(Hours) ;
		int Minutes = Integer.parseInt(time.substring(3,5)) ;
		//System.out.println(Minutes) ;

        int TotalMinutes = Minutes + MinutesToAdd + Hours * 60 ; 
		//System.out.println(TotalMinutes) ;
		int TotalHours = TotalMinutes / 60 ;
        //System.out.println(TotalHours) ;
        
        int NewHours = TotalHours % 24 ;
        //System.out.println(NewHours) ;
		int NewMinutes = TotalMinutes - (TotalHours * 60) ;
        //System.out.println(NewMinutes) ;

        if (NewHours<10 && NewMinutes<10) { 
            System.out.print("0" + NewHours + ":0" + NewMinutes) ;
        } else if (NewMinutes<10) { 
            System.out.print(NewHours + ":0" + NewMinutes) ;
        } 
        else if (NewHours<10) { 
            System.out.print("0" + NewHours + ":" + NewMinutes) ; 
        } 
        else { 
            System.out.print(NewHours + ":" + NewMinutes) ; 
        }
    }
}
