import java.util.HashMap;

public class Const extends Equation{
	double value;
	
	public Const(Double v) {
		value = v;
	}
	
	
	public double eval(HashMap<String, Double> context) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		int temp = (int)value*100;
		double rtn = (double)temp/100;
		return ""+rtn;
	}

}
