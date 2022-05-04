package kr.hs.dgsw.java.Ex1;

import java.util.*;

public class Dog {
	
	String color;
	Double weight;
	String name;
	Integer age;
	
	public void Dog() {
		System.out.println("생성자 호출");	
		}
	
	public void makeSound() {
		System.out.println("멍멍");
	}
	
	public void eat(String food) {
		System.out.println(name + "이(가)" + food + "를 먹는다.");
	}	
	
	public void info() {
		System.out.println("이름 : " + name + "\n몸무게 : " + weight +"kg\n색 : " + color);
	}
	public void print() {
		System.out.printf("%s는 %d살입니다.",this.name,this.age);
	}
	public static void main(String[] args) {
		Dog happy = new Dog();
		happy.print();
		Scanner scan = new Scanner(System.in);
	}
}
