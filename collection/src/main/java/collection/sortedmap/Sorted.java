package collection.sortedmap;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted {
	
	public SortedMap sortData(List<ModelData> listModelData) {
		
		SortedMap<String, Integer> map =new TreeMap <String,Integer>();

		for (ModelData modelData : listModelData) {
			map.put(modelData.getNamer(), modelData.getNumber());
		}
		return map;
	}
	
    public boolean isMethod() {
        return true;
    }

}
