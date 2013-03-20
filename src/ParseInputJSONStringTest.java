import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ParseInputJSONStringTest {

	@Test
	public void testParseInputJSONString() {
		// write tests that create weird JSON strings that the computer must
		// look at and send back

	}

	@Test
	public void testGetRumorData() {
		// pass a name that does not exist in the list.
		String json = "{ rumors : " + "["
				+ "{'rumorID' : 1, 'gossiper': tKyler, 'victim': Diana} ]}";

		ParseInputJSONString testJson = new ParseInputJSONString(json);

		Graph g = new Graph();
		
		assertTrue(g.network.containsKey(testJson.getRumorData().rumors[0].getGossiper()));

	}

}
