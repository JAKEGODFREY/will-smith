package src.root;

public abstract class Quadrilateral {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	
	private Line line1;
	private Line line2;
	private Line line3;
	private Line line4;
	

	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	public Line getLine1() {
		return line1;
	}
	public void setLine1(Line line1) {
		this.line1 = line1;
	}
	public Line getLine2() {
		return line2;
	}
	public void setLine2(Line line2) {
		this.line2 = line2;
	}
	public Line getLine3() {
		return line3;
	}
	public void setLine3(Line line3) {
		this.line3 = line3;
	}
	public Line getLine4() {
		return line4;
	}
	public void setLine4(Line line4) {
		this.line4 = line4;
	}
	
	abstract void parallels();
	abstract double getPerimeter();
	abstract double getArea();
	
}
