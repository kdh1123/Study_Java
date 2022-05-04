package kr.hs.dgsw.java.K0420;

public class Subtractor extends Adder{
	@Override
	public int calculate(Values values) {
		return values.getValue1() - values.getValue2();
	}
	
	@Override
	public void showResult(Values values, int result) {
		System.out.println( values.getValue1()+" - "+ values.getValue2()+" = "+result);
	}
	public String getOperator() {
		return " - ";
	}
	public static void main(String[] args) {
		Subtractor subtractor = new Subtractor();
		subtractor.execute();
	}
}
