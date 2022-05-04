package kr.hs.dgsw.java.K0413;

public class Stack {
	private final String[] buffer;
	
	private final int SIZE = 10;
	
private int index;
	
	public Stack() {
		this.buffer = new String[SIZE];
		this.index = 0;
	}
	public void push(String value) {
		this.buffer[this.index++] = value;
	}
	public String pop() {
		
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("Dog");
		stack.push("Lion");
		stack.push("Shark");
		stack.push("Butterfly");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
