package src.root;
public class Trapezium extends Quadrilateral{

	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	Quadrilateral quadrilateral = new Trapezium(point1, point2, point3, point4);
	
	public Trapezium(){
		
	}
	
	public Trapezium(Point point1, Point point2, Point point3, Point point4){
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;		
		
	}
	
	public boolean isTrapezium(Quadrilateral quad) throws ShapeException{
		
		
		boolean isTrapezium = false;
				
		if(quadrilateral.getLine1().getSlope()==quadrilateral.getLine3().getSlope() && quadrilateral.getLine2().getSlope()!=quadrilateral.getLine4().getSlope()){
			isTrapezium = true;
		}
		else if(quadrilateral.getLine2().getSlope()==quadrilateral.getLine4().getSlope() && quadrilateral.getLine1().getSlope()!=quadrilateral.getLine3().getSlope()){
			isTrapezium = true;
		}
		else{
			return isTrapezium;
		}

		return isTrapezium;
	}




	@Override
	int parallels() {
		int numberOfParallelSides = 0;
		if(quadrilateral.getLine1().getSlope()==quadrilateral.getLine3().getSlope()){
			numberOfParallelSides += 1;
		}
		if(quadrilateral.getLine2().getSlope()==quadrilateral.getLine4().getSlope()){
			numberOfParallelSides += 1;
		}
		return numberOfParallelSides;
	}

	@Override
	double getPerimeter() {
		return quadrilateral.getLine1().getLength(point1, point2) + quadrilateral.getLine2().getLength(point2, point3) + quadrilateral.getLine3().getLength(point3, point4) + quadrilateral.getLine4().getLength(point4, point1);


	}

	@Override
	double getArea() {
		double lengthDifference = quadrilateral.getLine1().getLength(point1, point2) - quadrilateral.getLine4().getLength(point4, point1);
		double height = Math.sqrt((quadrilateral.getLine2().getLength(point2, point3)*quadrilateral.getLine2().getLength(point2, point3))-(lengthDifference*lengthDifference));
		return ((quadrilateral.getLine1().getLength(point1, point2)+quadrilateral.getLine4().getLength(point4, point1))/2)*height;
		
	}


	
}
