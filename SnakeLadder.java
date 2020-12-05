public class SnakeLadder {
  
	// initializing starting position
    static void start() {
    int starting =0; 
    System.out.println("Starting position" +starting );
      }
     
    
    //get number between 1-6
    static int Diceroll() {
 	   int max=6;
 	   int min=1;
       int c=(int)Math.random()*(max-min+1)+min;
       return c;
      }
    
    
	public static void main (int args []) {
     int player=1;
     start();
     Diceroll();
     }
}

