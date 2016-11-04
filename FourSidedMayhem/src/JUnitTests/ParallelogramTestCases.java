package src.JUnitTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.root.Parallelogram;
import src.root.Point;


public class ParallelogramTestCases {
	Parallelogram testParallelogram;

	@Before
	public void setUp(){
		testParallelogram = new Parallelogram(new Point(5.0, 5.0), new Point(11.0, 5.0),new Point(12.0, 20.0),new Point(6.0, 20.0));
	}
	
	@Test
	public void getAreaTest() {
		Double target = new Double(90.0);
		Double actual  = testParallelogram.getArea();

		assertEquals(target, actual);
	}
	
	
	@Test
	public void getPerimeterTest(){
		
		Double target = new Double(42.07);
		Double actual  = testParallelogram.getPerimeter();
		assertEquals(target, actual);
	}
	
	
}
