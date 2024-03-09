package stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class StreamTest {
	
	
	@Test
	public void findTestMin() {
		
		
		ArrayList<Integer> collection = new ArrayList<Integer>();
		collection.add(10);
		collection.add(4);
		collection.add(6);
		collection.add(3);
		
		Integer minVal = collection.stream().reduce(Integer::min).orElse(-1);
		
		assertTrue((minVal==3), "is min val 'true'");
	}
	

}
