package kr.hs.dgsw.java.K0406;

public class AccessModifier {
	public int publicvalue;
	
	private int privatevalue;
	
	protected int protectedvalue;
	
	int defaultvalue;
	
	public static void main(String[] args) {
		AccessModifier AM = new AccessModifier();
		AM.defaultvalue = 3;
		AM.privatevalue = 5;
		AM.publicvalue = 7;
		AM.protectedvalue  = 9;
		
		
	}
}
