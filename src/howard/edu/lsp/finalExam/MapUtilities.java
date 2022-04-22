package howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
	
	static int commonPairs = 0;

	public static int commonKeyValuePairs(HashMap<String, String> mapA, HashMap<String, String> mapB) throws NullPointerException {

		int commonPairs = 0;

		for (Map.Entry<String, String> map : mapA.entrySet()) {
			String aKey = map.getKey();
			String aVal = map.getValue();
			if (mapB.containsKey(aKey)) {
				if (aVal.equals(mapB.get(aKey))) {
					commonPairs += 1;
				}
			}
		}

		return commonPairs;

	}

}