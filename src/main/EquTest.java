package main;

import static org.junit.Assert.*;


public class EquTest {
	
	Equ ojb ;
	
	@Before
	
	public void setup() {
		ojb = new Equ() ;
	}
	
	@Test
		public void test01() {
		
		assertEquals(25 , ojb.square(5));
		
	}
	
	@Test
		public void test02{
		
		assertEqulas(ojb.countLetterA("aatrox"),5)
		
	}
	
	@Test
		public void test03{
		
		assertTrue(ojb.checkTwoLetter("a"))
		
	}

}
