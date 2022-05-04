package kr.hs.dgsw.java.K0420;

public class Tiger extends Mammal{
	
	public void makeSound() {
		System.out.println("어흥");
	}
	@Override
	public void move() {
		System.out.println("범 내려온다");
	}
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.move();
		tiger.birth();
		tiger.makeSound();
		
		Mammal tiger2 = new Tiger();
		tiger2.move();
		tiger2.birth();
	}
}
