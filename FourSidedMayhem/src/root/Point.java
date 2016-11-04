package root;

public class Point {
	
	private double x;
	private double y;
	
	
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "X:" + x + ", Y:" + y;
	}

	public double distanceTo(double i, double j){
		
		double dx= this.x - i;
		double dy= this.y - j;
		return Math.sqrt((dx*dx) + (dy*dy));
	}
}
