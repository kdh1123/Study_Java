package kr.hs.dgsw.java.K0427;

public class Zoo {
	
	public void breed(Animal animal) {
		animal.printSound();
	}
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal horse = new Horse();//다형성 : 부모 클래스 타입의 참조변수로 자식 클래스 타입의 인스턴스를 생성할 수 있음 
		Zoo zoo = new Zoo();
		zoo.breed(cat);
		zoo.breed(dog);
		zoo.breed(horse);
	}
}
