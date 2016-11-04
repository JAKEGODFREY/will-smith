package src.root;

public class Square extends Rectangle {
	
	public Square(Point point1, Point point2, Point point3, Point point4) {
		super(point1, point2, point3, point4);
		// TODO Auto-generated constructor stub
	}

	static boolean isSquare(Point point1, Point point2, Point point3, Point point4){
		Quadrilateral quad = new Square(point1, point2, point3, point4);
		
		if((quad.getLine1()== quad.getLine3()) && (quad.getLine2() == quad.getLine4())) {
			return true;
		}
		
		return false;
		
		
	}



}
