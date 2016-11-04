package src.root;
public class Trapezium extends Quadrilateral{

	private Line longBase;
	private Line shortBase;
	private Line slantingSide1;
	private Line slantingSide2;
	
	public boolean isTrapezium(Quadrilateral quad){
		boolean isTrapezium = false;
				
		if(longBase.getSlope()==shortBase.getSlope() && slantingSide1.getSlope()!=slantingSide2.getSlope()){
			isTrapezium = true;
		}
		else if(slantingSide1.getSlope()==slantingSide2.getSlope() && longBase.getSlope()!=shortBase.getSlope()){
			isTrapezium = true;
		}
		else{
			return isTrapezium;
		}

		return isTrapezium;
	}

<<<<<<< HEAD

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
=======
	@Override
	int parallels() {
		int numberOfParallelSides = 0;
		if(longBase.getSlope()==shortBase.getSlope()){
			numberOfParallelSides += 1;
		}
		if(slantingSide1.getSlope()==slantingSide2.getSlope()){
			numberOfParallelSides += 1;
		}
		return numberOfParallelSides;
	}

	@Override
	double getPerimeter() {
		return longBase.getLength() + shortBase.getLength() + slantingSide1.getLength() + slantingSide2.getLength();
>>>>>>> 0a896382b9ad693e0defbfb34d415cde2a10c3b6
	}

	@Override
	double getArea() {
<<<<<<< HEAD
		return 0.0;
		
	}


	@Override
	void parallels() {
		// TODO Auto-generated method stub

=======
		double lengthDifference = longBase.getLength() - shortBase.getLength();
		double height = Math.sqrt((slantingSide1.getLength()*slantingSide1.getLength())-(lengthDifference*lengthDifference));
		return ((longBase.getLength()+shortBase.getLength())/2)*height;
>>>>>>> 0a896382b9ad693e0defbfb34d415cde2a10c3b6
	}
}
