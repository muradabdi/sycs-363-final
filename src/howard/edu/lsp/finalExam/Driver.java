package howard.edu.lsp.finalExam;

import java.util.HashMap;

public class Driver {

	public static void main(String string[]) {
		HashMap<String, String> mapA = new HashMap<>();

		mapA.put("Alice","Healthy");
		mapA.put("Mary","Ecastic");
		mapA.put("Bob","Happy");
		mapA.put("Chuck","Fine");
		mapA.put("Felix","Sick");

		HashMap<String, String> mapB = new HashMap<>();
		
		mapB.put("Mary","Ecastic");
		mapB.put("Bob","Happy");
		mapB.put("Tam","Fine");
		mapB.put("Felix","Healthy");
		mapB.put("Ricardo","Subperb");

		System.out.println("Number of common key/value pairs: " + howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB));
	}

}