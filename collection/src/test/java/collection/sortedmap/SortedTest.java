package collection.sortedmap;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

import org.junit.jupiter.api.Test;

public class SortedTest {

	@Test
	public void sortData() {
		
		List<ModelData> listModeData = new ArrayList<ModelData>();
		listModeData.add(new ModelData(4, "парам 4"));
		listModeData.add(new ModelData(2, "парам 2"));
		listModeData.add(new ModelData(1, "парам 1"));
		listModeData.add(new ModelData(3, "парам 3"));
		
		Sorted sorted = new Sorted();
		SortedMap<String,Integer> sm = sorted.sortData(listModeData);
		System.out.println("firstKey:" + sm.firstKey());
		System.out.println(sm);
		assertTrue((sm.firstKey().equals("парам 1")), "Sorted.isMethod() return 'true'");
	}
	
	
	
}
