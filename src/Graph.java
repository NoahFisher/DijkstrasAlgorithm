import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * I use a CSVReader to create the network. Each student in the network is
 * modeled as a node. 
 */

// Information about each listener
class Node {
	String listener;
	int rumorPropTime = Integer.MAX_VALUE;
	int chatTime;
	boolean notVisited = true;

	Node() {
		this.listener = null;
	}

	Node(String listener) {
		this.listener = listener;
	}

	Node(String listener, int chatTime) {
		this.listener = listener;
		this.chatTime = chatTime;
	}

	// used to initialize inputs.
	Node(String listener, boolean notVisited, int rumorPropTime) {
		this.listener = listener;
		this.rumorPropTime = rumorPropTime;
		this.notVisited = notVisited;
	}
}

public class Graph {
	static final String file = "JavaCodingTestData.csv";
	Multimap<String, Node> network = ArrayListMultimap.create();

	public Graph() {
		try {
			// csv reader module reads data from file
			// line[0] = Talker
			// line[1] = listener
			// line[2] = chat time (seconds)

			CSVReader reader = new CSVReader(new FileReader(file));
			String[] line;

			while ((line = reader.readNext()) != null) {

				try {
					String talker = line[0];

					Node n = new Node(line[1], Integer.parseInt(line[2]));

					network.put(talker, n);

				} catch (NumberFormatException e) {
				}
			}

			reader.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}