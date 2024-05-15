package constructors;

public class P_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Parametrised p1 = new Parametrised( 10 , "seated" , "on" , "closed" );
		Parametrised p2 = new Parametrised( -10 , "seated" , "on" , "closed" );
		
		p1.run();
		p2.run();
	}

}
