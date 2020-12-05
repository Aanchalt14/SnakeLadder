public class SnakeLadder {
	 static int numberofplayer=1;
      static int position; 
	 //UC-1 initializing starting position
    static int start() {
        int position =0; 
        return position;
        }
    
    
    //UC-2 get number between 1-6
    static int rolling_dice() {
        int diceoutcome=(int)Math.random()*(6-1+1)+1;
        return diceoutcome;
    }
    
   
    
    //UC-3 play
    static int play() {
        int number=(int)Math.random()*(3-1+1)+1;  
    	switch (number) {
    	  case 1:
    	  System.out.println("Snake");
    	  position += rolling_dice();
    	  break;
    	
    	  case 2:
    	  System.out.println("Ladder" );
    	  position +=rolling_dice();
          break;
    	  
    	  default :
    	  System.out.println("No play");
        }
   }
	
    	//main method
     public static void main (int args []) {
       
        start();
        rolling_dice();
        play();
    }
}

