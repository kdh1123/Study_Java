package kr.hs.dgsw.java.K0420;

public class Square extends Polygon{
	protected final int width;
	
	public Square(int width) {
		this.width = width;
	}
	
	@Override
	public String getType() {
		return "정사각형";
	}
	
	@Override 
	public double getArea() {
		return this.width * this.width;
	}
	public static void main(String[] args) {
		Square polygon = new Square(20);
		polygon.print();
	}
}
