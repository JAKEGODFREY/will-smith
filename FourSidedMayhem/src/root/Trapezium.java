package src.root;
public class Trapezium extends Quadrilateral{

	private Line longBase;
	private Line shortBase;
	private Line slantingSide1;
	private Line slantingSide2;
	
	public boolean isTrapezium(Quadrilateral quad){
		boolean isTrapezium = false;
				
		if(longBase.getSlope()==shortBase.getSlope()){
			isTrapezium = true;
		}
		else if(slantingSide1.getSlope()==slantingSide2.getSlope()){
			isTrapezium = true;
		}
		else{
			return isTrapezium;
		}

		return isTrapezium;
	}

	@Override
	void parallels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
