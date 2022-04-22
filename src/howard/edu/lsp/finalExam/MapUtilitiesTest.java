package howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	@Test
	@DisplayName("Test case for two populated maps with no pairs")
	public void testNoPairs() {

		HashMap<String, String> mapA = new HashMap<>();

		mapA.put("Alice", "Healthy");
		mapA.put("Bob", "Happy");
		mapA.put("Chuck", "Fine");
		mapA.put("Felix", "Sick");

		HashMap<String, String> mapB = new HashMap<>();
		
		mapB.put("Mary", "Ecastic");
		mapB.put("Tam", "Fine");
		mapB.put("Felix", "Healthy");
		mapB.put("Ricardo", "Subperb");
		
		int expected = 0;
		int actual = howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test case for one populated and one empty map")
	public void testOneEmptyMap() {
		HashMap<String, String> mapA = new HashMap<>();

		mapA.put("Alice", "Healthy");
		mapA.put("Bob"," Happy");
		mapA.put("Chuck", "Fine");
		mapA.put("Felix", "Sick");

		HashMap<String, String> mapB = new HashMap<>();
		
		int expected = 0;
		int actual = howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test two empty maps")
	public void testTwoEmptyMaps() {
		HashMap<String, String> mapA = new HashMap<>();
		HashMap<String, String> mapB = new HashMap<>();
		
		Object expected = 0;
		int actual = howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test case for two completely identical maps")
	public void testIdenticalMaps() {
		HashMap<String, String> mapA = new HashMap<>();

		mapA.put("Mary", "Ecastic");
		mapA.put("Tam", "Fine");
		mapA.put("Felix", "Healthy");
		mapA.put("Ricardo", "Subperb");

		HashMap<String, String> mapB = new HashMap<>();
		
		mapB.put("Mary", "Ecastic");
		mapB.put("Tam", "Fine");
		mapB.put("Felix", "Healthy");
		mapB.put("Ricardo", "Subperb");
		
		int expected = 4;
		int actual = howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB);
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test case for only some matching pairs")
	public void testSomePairs() {
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
		
		int expected = 2;
		int actual = howard.edu.lsp.finalExam.MapUtilities.commonKeyValuePairs(mapA, mapB);
		
		assertEquals(expected, actual);
	}

}

