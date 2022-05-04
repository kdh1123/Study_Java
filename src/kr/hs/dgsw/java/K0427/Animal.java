package kr.hs.dgsw.java.K0427;

public abstract class Animal {
	
	public abstract String getName();
	public abstract String getSound();
	public void printSound() {
		System.out.printf("%s이(가) '%s' 소리냅니다\n",getName(),getSound());
	}
	public static void main(String[] args) {
		//Animal animal = new Animal();  오류! 추상 클래스는 직접적으로 객체를 만들지 못함.s
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal horse = new Horse();// 상속한 클래스에서 객체를 만들 수 있음
		dog.printSound();
		cat.printSound();
		horse.printSound();
	}
}
