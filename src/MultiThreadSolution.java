import java.util.ArrayList;
import java.util.List;

public class MultiThreadSolution {

	private RumorDataParser rumorData;
	List<Dijkstra> rumors = new ArrayList<Dijkstra>();

	public MultiThreadSolution(RumorDataParser rumorData) {

		this.setRumorData(rumorData);

		// only create one graph for all threads
		Graph graph = new Graph();

		List<Thread> threads = new ArrayList<Thread>();

		for (int i = 0; i < rumorData.rumors.length; i++) {
			// System.out.println(rumorData.rumors[i] + "\n");

//			if (graph.network.containsKey(rumorData.rumors[i].getGossiper())
//					&& graph.network.containsValue(rumorData.rumors[i]
//							.getVictim())) {
//				// the starting condition is met and someone talks to the
//				// victim, a solution *may* exist
//			} else {
//				// no solution exists
//			}

			Runnable task = new Dijkstra(graph, rumorData.rumors[i]);
			Thread worker = new Thread(task);

			rumors.add((Dijkstra) task);

			worker.start();
			threads.add(worker);
		}

		// run until all threads have completed. .
		int running = 0;
		do {
			running = 0;
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					running++;
				}
			}

		} while (running > 0);

	}

	public RumorDataParser getRumorData() {
		return rumorData;
	}

	public void setRumorData(RumorDataParser rumorData) {
		this.rumorData = rumorData;
	}

}
