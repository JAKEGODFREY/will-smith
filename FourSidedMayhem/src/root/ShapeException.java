
public class ShapeException {

	public ShapeException(Parallelogram p, Point p1, Point p2, Point p3, Point p4) {

		System.out.println("The following coordinates cannot be used to make a Paralleogram");
		System.out.println("("+ p1.getX()+","+p1.getY()+")");
		System.out.println("("+ p2.getX()+","+p2.getY()+")");
		System.out.println("("+ p3.getX()+","+p3.getY()+")");
		System.out.println("("+ p4.getX()+","+p4.getY()+")");
	}

	public ShapeException(Trapezium t, Point p1, Point p2, Point p3, Point p4) {
		System.out.println("The following coordinates cannot be used to make a Trapezium");
		System.out.println("("+ p1.getX()+","+p1.getY()+")");
		System.out.println("("+ p2.getX()+","+p2.getY()+")");
		System.out.println("("+ p3.getX()+","+p3.getY()+")");
		System.out.println("("+ p4.getX()+","+p4.getY()+")");
	}

	public ShapeException(Rectangle r, Point p1, Point p2, Point p3, Point p4) {
		System.out.println("The following coordinates cannot be used to make a Rectangle");
		System.out.println("("+ p1.getX()+","+p1.getY()+")");
		System.out.println("("+ p2.getX()+","+p2.getY()+")");
		System.out.println("("+ p3.getX()+","+p3.getY()+")");
		System.out.println("("+ p4.getX()+","+p4.getY()+")");
	}

	public ShapeException(Square s, Point p1, Point p2, Point p3, Point p4) {
		System.out.println("The following coordinates cannot be used to make a Square");
		System.out.println("("+ p1.getX()+","+p1.getY()+")");
		System.out.println("("+ p2.getX()+","+p2.getY()+")");
		System.out.println("("+ p3.getX()+","+p3.getY()+")");
		System.out.println("("+ p4.getX()+","+p4.getY()+")");
	}

}
