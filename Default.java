package constructors;

public class Default {
       
	  private int speed;
	  private String driver;
	  private String engine;
	  private String doors;
	  
	  public Default() {
		  
		  speed = 10;
		  driver = "seated";
		  engine = "on";
		  doors = "closed";
		  
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