package lang.reflect;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class InheritanceCheckTest {

	
	
	@Test
	void classHierarchyCheck() {
		interface MyInterface{}
		class MyClass implements MyInterface  {}
		
		InheritanceCheck inheritanceСheck = new InheritanceCheck();
		assertTrue(inheritanceСheck.classHierarchyCheck(MyInterface.class, MyClass.class), "classHierarchyCheck return 'true'");
	}
	
}
