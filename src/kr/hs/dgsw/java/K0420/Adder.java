package kr.hs.dgsw.java.K0420;

import java.util.*;

public class Adder {
	
	private final Scanner scanner;
	
	public Adder() {
		this.scanner= new Scanner(System.in);
	}
	
	public void execute() {
		Values values = this.inputValues();
		
		int result = this.calculate(values);
		
		this.showResult(values,result);
		
		this.scanner.close();
	}
	public Values inputValues() {
		Values values = new Values();
		System.out.println("첫번째 정수를 입력해주세요.");
		values.setValue1(scanner.nextInt());
		System.out.println("두번째 정수를 입력해주세요.");
		values.setValue2(scanner.nextInt());
		scanner.close();
		
		return values;
		
	}
	public int calculate(Values values) {
		return values.getValue1() * values.getValue2();
	}
	public void showResult(Values values, int result) {
		System.out.println( values.getValue1()+this.getOperator()+ values.getValue2()+" = "+result);
	}
	
	public String getOperator() {
		return " + ";
	}
	
	public class Values {
		private int value1;
		private int value2;
		
		public int getValue1() {
			return value1;
		}
		public void setValue1(int value1) {
			this.value1 = value1;
		}
		public int getValue2() {
			return value2;
		}
		public void setValue2(int value2) {
			this.value2 = value2;
		}
		
	}
	
	public static void main(String[] args) {
		Adder add = new Adder();
		add.execute();
	}
}
