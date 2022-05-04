package kr.hs.dgsw.java.K0420;

public class Circle extends Polygon{
	protected final int r;
	protected final double pai = 3.14;
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public String getType() {
		return "원";
	}
	
	@Override 
	public double getArea() {
		return (this.r * this.r / this.pai);
	}
	public static void main(String[] args) {
		Circle polygon = new Circle(10);
		polygon.print();
	}
}
