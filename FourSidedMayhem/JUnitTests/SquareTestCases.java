import static org.junit.Assert.*;

import org.junit.Test;


public class SquareTestCases {

	@Test
	public void getAreaTest() {
		Square testSquare = new Square(10); 
		
		assertEquals("area must be 100", 100, testSquare.getArea());
	}
	
	public void getPerimeterTest() {
		Square testSquare = new Square(10); 
		
		assertEquals("perimeter must be 40", 40, testSquare.getPerimeter());
	}
	
	public void getAreaTest() {
		Square testSquare = new Square(); 
		
		assertEquals("area must be 100", 100, testSquare.getArea());
	}

}
