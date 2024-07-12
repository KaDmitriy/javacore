package lang.core.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaseInterfaceTest {

	@Test
	void testOf() {
		
	 	var bi = BaseInterface.of(10);
	 	bi.printline();
	 	assertTrue( bi.equals(new BaseImpl1(10)) );
		
	}

}
