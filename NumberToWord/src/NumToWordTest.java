import static org.junit.Assert.*;

import org.junit.Test; //import statement for @Test annotation

public class NumToWordTest {

	// Test case for convertToWords(int n ) method
	@SuppressWarnings("static-access")
	@Test   //@Test annotation used for identifies a  method as a test method
	public void convertToWordsTest() 
	{
		
		NumToWord n= new NumToWord (); //NumToWord class is Tested
		String expectedresult="five Lakh eighty six Thousand nine Hundred thirty two ";
		assertEquals(expectedresult, n.convertToWords(586932));
		System.out.println("First Test case Pass: Expected and actual output is same");
	}

	//Test case for numToWords() method
	@Test
	public void numToWordsTest() 
	{
		
		NumToWord n= new NumToWord (); //NumToWord class is Tested
		String expectedresult="nineteen ";
		assertEquals(expectedresult, n.numToWords(19));
		System.out.println("Second Test case Pass: Expected and actual output is same");
	}

}
