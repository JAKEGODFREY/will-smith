package src.JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;


public class TrapeziumTestCases {

	@Test
	public void getAreaTest() {
		Trapezium testTrapezium = new Trapezium(10); 
		
		assertEquals("area must be 100", 100, testTrapezium.getArea());
	}

}
