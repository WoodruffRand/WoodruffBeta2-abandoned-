import java.util.HashMap;

public class WoodruffBeta {
	
	public static void main(String args[]) {
		Equation a = new  Var("X");
		Equation b = new Const(5.1111111);
		
		HashMap<String, Double> c = new HashMap<String,Double>();
		
		c.put("X", 10.0);
		
		
		System.out.println(a.toString()+"+"+b.toString());
		System.out.println(a.eval(c)+b.eval(c));
		
	}

}
