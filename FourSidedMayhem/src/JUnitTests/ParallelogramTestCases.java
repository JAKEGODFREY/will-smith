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
		assertEquals(90.0, testParallelogram.getArea());
	}
	
	@Test
	public void isParallelogramTest(){
		assertEquals(true, testParallelogram.getPerimeter());
	}
	
	public void getPerimeterTest(){
		assertEquals()
	
	
	
	
}
