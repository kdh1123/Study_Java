package kr.hs.dgsw.java.Ex1;

public class People {
	String name;
	Double m;
	Double kg;
	public double Bmi() {
		return kg / (m * m);
	}
	public void PrintBmi() {
		m /= 100;
		System.out.printf(name + "의 비만도는 %.2f이고 ",Bmi());
		if(Bmi() >= 25 ) {
			System.out.println("과체중입니다");
		}
		else if(Bmi() >= 20 ) {
			System.out.println("정상체중입니다");
		}
		else {
			System.out.println("저체중입니다");
		}
	}
}
