import java.util.ArrayList;

public class Dijkstra implements Runnable {

	int shortestPath = 0;
	int rumorID;
	String victim;
	String talker;

	long elapsedTime;
	long startTime;

	Graph g;

	Node n;
	ArrayList<Node> nodeList = new ArrayList<Node>();

	public Dijkstra(Graph g, RumorData rumorData) {
		startTime = System.currentTimeMillis();

		this.victim = rumorData.getVictim();
		this.talker = rumorData.getGossiper();
		this.rumorID = rumorData.getRumorID();

		this.g = g;

		// initialize inputs
		this.n = new Node(talker, false, 0);
		nodeList.add(this.n);

	}

	public void run() {
		algorithm(this.n);
		long stopTime = System.currentTimeMillis();
		this.elapsedTime = stopTime - startTime;
	}

	// recursive approach
	public void algorithm(Node currentNode) {
		Node nextNode = new Node();
		// get local network, add node to nodeList if it doesn't already exist.
		for (Node networkNode : g.network.get(currentNode.listener)) {
			boolean addNode = true;
			for (Node listNode : nodeList) {
				// if in nodeList...
				if (networkNode.listener.equals(listNode.listener)) {
					if (shortestPath + networkNode.chatTime < listNode.rumorPropTime) {
						listNode.chatTime = shortestPath + networkNode.chatTime;
					}
					addNode = false;
					break;
				}
			}
			if (addNode) {
				Node n = new Node(networkNode.listener);
				n.rumorPropTime = networkNode.chatTime + shortestPath;
				nodeList.add(n);
			}
		}

		// choose the shortestPath
		for (Node n : nodeList) {
			if (n.rumorPropTime < nextNode.rumorPropTime && n.notVisited) {
				nextNode = n;
				shortestPath = n.rumorPropTime;
			}
		}

		nextNode.notVisited = false;

		if (!nextNode.listener.equals(victim)) {
			algorithm(nextNode);
		}
	}
}
