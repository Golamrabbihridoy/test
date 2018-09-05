package test;

import static org.junit.Assert.*;
import main.OperatorTestClass;
import org.junit.Test;

public class OperatorTestUnitTest {
	OperatorTestClass oT = new OperatorTestClass();
	@Test
	public void testarithmeticOperator() {
		assertEquals(19,oT.addition(12,7));
		assertEquals(5,oT.subtraction(12,7));
		assertEquals(84,oT.multiplication(12,7));
		assertEquals(5,oT.modulus(12,7));
		assertEquals(7,oT.division(45,6));
		
	}
	@Test
	public void testbitwiseOperator() {
		assertEquals(-3,oT.bitNot(2));
		assertEquals(1,oT.bitAnd(1,3));
		assertEquals(3,oT.bitOr(1,3));
	    assertEquals(2,oT.bitxor(1,3));
		assertEquals(10,oT.bitShiftLeft(5));
		assertEquals(2,oT.bitShiftRight(5));
		
	}
	@Test
	public void testLogicalOperator() {
		assertEquals(true,oT.logicalor(true,false));
		assertEquals(false,oT.logicalAnd(true,false));
		assertEquals(true,oT.logicalNot(false));
		assertEquals(true,oT.logicalxor(true,false));
	}
}
