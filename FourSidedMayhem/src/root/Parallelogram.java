package src.root;

public class Parallelogram extends Trapezium {
	
	static boolean isParallelogram(Point point1, Point point2, Point point3, Point point4){
		
		Quadrilateral quad = new Parallelogram(point1, point2, point3, point4);
			
		if ((quad.getLine1().getLength() == quad.getLine3().getLength())&&(quad.getLine2().getLength() == quad.getLine4().getLength() )){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Parallelogram (Point point1, Point point2, Point point3, Point point4){
		
	this.setPoint1(point1);
	this.setPoint2(point2);
	this.setPoint3(point3);
	this.setPoint4(point4);
	
	this.setLine1(new Line(point1, point2));
	this.setLine1(new Line(point2, point3));
	this.setLine1(new Line(point3, point4));
	this.setLine1(new Line(point4, point1));
	
	}

	@Override
	void parallels() {
		// TODO Auto-generated method stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
