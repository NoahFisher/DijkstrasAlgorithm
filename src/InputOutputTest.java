import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InputOutputTest {

	@Test
	public void test() {
		// String json =
		// "{ rumors : " + "["
		// + "{'rumorID' : 1, 'gossiper': Kyler, 'victim': Diana} ]}";

		String json = "{ rumors : " + "["
				+ "{'rumorID' : 1, 'gossiper': Kyler, 'victim': Diana},"
				+ "{'rumorID' : 2, 'gossiper': Carmen, 'victim': Angel}]}";

		// Graph g = new Graph()

		// assertTrue(g.network.containsKey(arg0));

		InputOutput solution = new InputOutput();

		String s = solution.main(json);

		System.out.println(s);

	}

}
