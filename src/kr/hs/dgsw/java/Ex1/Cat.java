package kr.hs.dgsw.java.Ex1;

public class Cat {
	
	String color;
	Double weight;
	String name;
	Integer age;
	
	public void Dog() {
		System.out.println("생성자 호출");	
		}
	
	public void makeSound() {
		System.out.println("야옹");
	}
	
	public void eat(String food) {
		System.out.println(name + "이(가)" + food + "를 먹는다.");
	}	
	
	public void info() {
		System.out.println("이름 : " + name + "\n몸무게 : " + weight +"kg\n색 : " + color);
	}
	public void print() {
		System.out.printf("%s는 %d살이고, %s색입니다",this.name,this.age,this.color);
	}
	public String getName() {
		return this.name;
	}
}
