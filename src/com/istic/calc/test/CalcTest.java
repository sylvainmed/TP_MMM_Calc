package com.istic.calc.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.istic.calc.command.AddCommand;
import com.istic.calc.command.Command;
import com.istic.calc.command.DivCommand;
import com.istic.calc.command.MulCommand;
import com.istic.calc.command.SubCommand;

public class CalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		int r = 5;
		
		Command cmd = new AddCommand(a,b);
		int e = cmd.execute();
		assertEquals(r,e);
	}
	
	@Test
	public void testMul() {
		int a = 3;
		int b = 2;
		int r = 6;
		
		Command cmd = new MulCommand(a,b);
		int e = cmd.execute();
		assertEquals(r,e);
	}
	
	@Test
	public void testSub() {
		int a = 3;
		int b = 2;
		int r = 1;
		
		Command cmd = new SubCommand(a,b);
		int e = cmd.execute();
		assertEquals(r,e);
	}
	
	@Test
	public void testDiv() {
		int a = 3;
		int b = 2;
		int r = 1;
		
		Command cmd = new DivCommand(a,b);
		int e = cmd.execute();
		assertEquals(r,e);
	}
	
	@Test
	public void testDivZero() {
		int a = 3;
		int b = 0;
		int r = 1;
		
		Command cmd = new DivCommand(a,b);
		int e = cmd.execute();
		assertEquals(r,e);
	}

}
