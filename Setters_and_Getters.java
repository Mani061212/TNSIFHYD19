package constructors;

public class Setters_and_Getters {
      
	  private int speed;
	  private String driver;
	  private String engine;
	  private String doors;
	  
	    public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public String getDriver() {
			return driver;
		}
		public void setDriver(String driver) {
			this.driver = driver;
		}
		public String getEngine() {
			return engine;
		}
		public void setEngine(String engine) {
			this.engine = engine;
		}
		public String getDoors() {
			return doors;
		}
		public void setDoors(String doors) {
			this.doors = doors;
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
