package kr.hs.dgsw.java.K0406;

public class Operater {
	public void studyBitwiseOperater(){
		int value1 = 0x01;
		int value2 = 0x02;
		int value3 = 0x03;
		
		int value;
		
		value = value1 & value2;
		System.out.printf("%d  & %d = %d\n",value1,value2,value);
		
		value = value1 | value2;
		System.out.printf("%d  & %d = %d\n",value1,value2,value);
		
		value = value1 ^ value2;
		System.out.printf("%d  & %d = %d\n",value1,value2,value);
		
		value1 = -1;
		value = value1 << 1;
		System.out.printf("%d << 1 = %d\n",value1,value);
		
		value1 = -1;
		value = value1 >> 1;
		System.out.printf("%d >> 1 = %d\n",value1,value);
	}
	public static void main(String[] args) {
		Operater Op = new Operater();
		Op.studyBitwiseOperater();
	}
}
