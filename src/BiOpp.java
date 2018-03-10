import java.util.HashMap;

public class BiOpp extends Opp{
	
	public BiOpp(Equation a, Equation b) {
		lh = a; 
		rh = b;
	}

	public double eval(HashMap<String, Double> context) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*Ivars*/
	private Equation lh=null, rh = null;
	
	

}
