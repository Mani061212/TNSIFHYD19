package constructors;

public class Parametrised {
      
	  private int speed;
	  private String driver;
	  private String engine;
	  private String doors;
	  
	  public Parametrised( int speed , String driver , String engine , String doors ) {
		  
		  this.speed = speed ;
		  this.driver = driver ;
		  this.engine = engine ;
		  this.doors = doors ;
		  
	  }
	  
	  public void run() {
		  
		  if(speed == 10 && driver.equals("seated") && engine.equals("on") && doors.equals("closed")) {
			   
			  System.out.println(" car is running ");
		  }
		  else {
			  System.out.println(" car is not running ");
		  }
	  }
}
