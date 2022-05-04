package kr.hs.dgsw.java.K0427;

import java.util.*;

public abstract class Abstract {
	protected final Scanner scanner;
	protected int value1;
	protected int value2;
	
	public Abstract() {
		this.scanner = new Scanner(System.in);
	}
	public void execute() {
		while(true) {
		//두 개의 정수를 입력 받는다.
		this.inputValues();
		if(value1==0 && value2 == 0) break;
		
		//계산을 수행한다.
		int result = this.calculate();
		
		//결과를 출력한다.
		this.showResult(result);
		
		this.scanner.close();
		}
	}
	
	public void inputValues() {
		System.out.println("두 정수를 입력하세요.");
		this.value1 = scanner.nextInt();
		this.value2 = scanner.nextInt();
	}
	public abstract int calculate();
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d\n",this.value1,getOperator(),this.value2,result);
	}
	
	public abstract String getOperator();
	
	public static void main(String[] args) {
		Calculater adder = new Adder();
			adder.execute();
	}
}
