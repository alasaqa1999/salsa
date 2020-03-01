package test_p;

import static org.junit.Assert.*;

import org.junit.Test;

import code_p.calculator;

public class CodeTest {
calculator cal=new calculator();
	@Test
	public void add() {
		assertEquals(10, cal.add(6, 4));
	}
	public void mult() {
		assertEquals(24, cal.mult(6, 4));
	}
	public void sub() {
		assertEquals(2, cal.add(6, 4));
	}

}
