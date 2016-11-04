import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTestCases {

	@Test
	public void getAreaTest() {
		Rectangle testRectangle = new Rectangle(10); 
		
		assertEquals("area must be 100", 100, testRectangle.getArea());
	}

}
