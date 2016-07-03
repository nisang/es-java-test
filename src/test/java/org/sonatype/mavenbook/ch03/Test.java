package org.sonatype.mavenbook.ch03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {
	
	@BeforeClass
	public static void testbefore(){
		System.out.println("cc1");
	}
	@org.junit.Test(timeout=600)
	public void test1(){
		System.out.println("cc");
	}
	@Before
	public void testf(){
		System.out.println("cc3");
	}
	@org.junit.Test
	public void test2(){
		System.out.println("11");
	}
	@After
	public void testa(){
		System.out.println("cc4");
	}
	@AfterClass
	public static void testafter(){
		System.out.println("cc2");
	}
}
