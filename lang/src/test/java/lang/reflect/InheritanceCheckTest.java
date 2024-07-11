package lang.reflect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InheritanceCheckTest {

	@Test
	void testClassHierarchyCheck() {
		interface MyInterface{}
		class MyClass implements MyInterface  {}
		
		InheritanceCheck inheritanceСheck = new InheritanceCheck();
		assertTrue(inheritanceСheck.classHierarchyCheck(MyInterface.class, MyClass.class), "classHierarchyCheck return 'true'");
	}

}
