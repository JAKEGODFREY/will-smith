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
	}

	@Override
	double getArea() {
		double lengthDifference = longBase.getLength() - shortBase.getLength();
		double height = Math.sqrt((slantingSide1.getLength()*slantingSide1.getLength())-(lengthDifference*lengthDifference));
		return ((longBase.getLength()+shortBase.getLength())/2)*height;
	}
	
	
}
