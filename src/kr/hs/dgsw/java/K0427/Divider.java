package kr.hs.dgsw.java.K0427;

public class Divider extends Calculater{

	@Override
	public int calculate() {
		return this.value1/this.value2;
	}

	@Override
	public String getOperator() {
		return "/";
	}
	
}
