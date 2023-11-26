package test;

import myPackage.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class TestCase {

	 @Test
	    public void testAddition() {
		 Operations myClass = new Operations();
	        int result = myClass.Add(2, 3);
	        assertEquals(5, result);
	    }

	    @Test
	    public void testSubtraction() {
	    	Operations myClass = new Operations();
	        int result = myClass.Sub(5, 3);
	        assertEquals(2, result);
	    }

}
