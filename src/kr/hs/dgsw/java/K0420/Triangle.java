package kr.hs.dgsw.java.K0420;

public class Triangle extends Polygon{
	protected final int width;
	protected final int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String getType() {
		return "직각삼각형";
	}
	
	@Override 
	public double getArea() {
		return (this.width * this.height / 2);
	}
	public static void main(String[] args) {
		Triangle polygon = new Triangle(20,10);
		polygon.getArea();
	}
}
