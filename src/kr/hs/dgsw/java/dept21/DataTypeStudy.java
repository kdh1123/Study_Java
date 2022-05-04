package kr.hs.dgsw.java.dept21;

public class DataTypeStudy {
	public void studyIntegerType() {
		int intValue=300;
		byte byteValue = 127;
		short shortValue = 1000;
	    long longValue= 3000000000000000000L;
	}

	public void  studyRealNumberType() {
		float piFloat = 3.1416926123F;
		double piDouble = 3.1416926123;
		
		System.out.println(piFloat);
		System.out.println(piDouble);
	}
	public void studyBoolean() {
		System.out.println((4>2));
		boolean flag = true;
		boolean win = false;
		if(4<2) {
			//DO Something 
		}
	}
	public void studyChar() {
		char ch1 = 'a';
		String str = "";
		int ch2 = 65;
	
		System.out.println((int)ch1);
		System.out.println((char)ch2);
	}
	public void math() {
		int a = 10;
		int b = 3;
		System.out.println((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b)+"\n"+((double)a/(double)b));
	}
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.math();
	}
}	