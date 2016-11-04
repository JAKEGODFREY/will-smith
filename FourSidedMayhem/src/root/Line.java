package root;

import javafx.scene.effect.Light.Point;

public class Line {
	
	
	private Point p1;
	private Point p2;
	
	public Line(Point point1, Point point2)
	{
		p1 = point1;
		p2 = point2;
	}
	
	/**
	 * Created: 04/11/2016
	 * By: Tim Bretherton, Callum Holden
	 * 
	 * 
	 * Returns the length of a line.
	 * @return
	 */
	public double getLength()
	{
		double length = p1.distanceTo(p2);		
		return length;
	}
	
	/**
	 * Created: 04/11/2016
	 * By: Tim Bretherton, Callum Holden
	 * 
	 * 
	 * Returns the gradient of a line.
	 * @return
	 */
	public double getSlope()
	{
		double deltaX = p2.getX() - p1.getX();
		double deltaY = p2.getY() - p1.getY();
		
		double slope = deltaY / deltaX;
		
		return slope;		
	}	

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	
	

}
