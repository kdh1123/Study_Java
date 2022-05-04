package kr.hs.dgsw.java.K0420;

public class Polygon {
	public String getType() {
		return "다각형";
	}
	public double getArea() {
		return 0;
	}
	public void print() {
		System.out.println(this.getArea());
	}
	public static void main(String[] args) {
		Polygon polygon = new Polygon();
		polygon.print();
	}
}
