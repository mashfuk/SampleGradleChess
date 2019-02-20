import static org.junit.Assert.*;

import org.junit.Test;

import com.tabit.ChessBoard;
import com.tabit.FileParser;

public class MyTests {
	
	@Test
	public void read() {

	 
	    String expected = "abc";
	    
	    String fileName1 = "D:\\Tabit Exam - Chess\\Tabit Exam - Chess\\src\\test\\resources\\test.txt";
		
		
		FileParser fp = new FileParser();
		String result = fp.parse(fileName1);
	    assertEquals(expected, result);
	
	}

}
