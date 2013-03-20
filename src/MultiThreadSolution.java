import java.util.ArrayList;
import java.util.List;

public class MultiThreadSolution {

	RumorDataParser rumorData;
	List<Dijkstra> rumors = new ArrayList<Dijkstra>();

	public MultiThreadSolution(RumorDataParser rumorData) {

		this.rumorData = rumorData;

		// only create one graph for all threads
		Graph graph = new Graph();

		List<Thread> threads = new ArrayList<Thread>();

		for (int i = 0; i < rumorData.rumors.length; i++) {
			// System.out.println(rumorData.rumors[i] + "\n");

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

}
