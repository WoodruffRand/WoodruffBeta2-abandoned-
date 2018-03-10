import java.util.HashMap;

public class Var extends Equation{
	private String name;
	
	
	public Var(String n) {
		name = n;
		
	}
	
	public double eval(HashMap<String, Double> context) {
		if(context.containsKey(name)) return context.get(name);
		//TODO add throws
		return 0;
	}


	public String toString() {
		return name;
	}

	

}