package lang.tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testParse() {
        String str0 =
        		"    _ \n"+
                "  | _|\n"+
                "  ||_ \n";
        Long l0 = 12L;
		
        String str1 =
        		"    _  _     _  _  _  _  _ \n"+
                "  | _| _||_||_ |_   ||_||_|\n"+
                "  ||_  _|  | _||_|  ||_| _|\n";
        Long l1 = 123456789L;
        String str2 =
        		" _  _  _  _  _  _  _  _  _ \n"+
                "| | _| _|| ||_ |_   ||_||_|\n"+
                "|_||_  _||_| _||_|  ||_| _|\n";
        Long l2 = 23056789L;
        String str3 =
				" _  _  _  _  _  _  _  _  _ \n"+
                "|_| _| _||_||_ |_ |_||_||_|\n"+ 
                "|_||_  _||_| _||_| _||_| _|\n";
        Long l3 = 823856989L;
	
        assertEquals(l0, BankAccount.parse(str0));
		assertEquals(l1, BankAccount.parse(str1));
		assertEquals(l2, BankAccount.parse(str2));
		assertEquals(l3, BankAccount.parse(str3));
	}

}
