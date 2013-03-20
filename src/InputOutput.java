import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class InputOutput {

	private ParseInputJSONString json;
	private MultiThreadSolution sol;

	// public static void main(String[] args) {
	public String main(String json) {
		// Input format
		// String json =
		// "{ rumors: [ {'rumorID' : int, 'gossiper': string, 'victim': string
		// },
		// {'rumorID' : int, 'gossiper': string, 'victim': string }...] } ";

		try {
			setJson(json);
		} catch (Exception e) {

		}

		try {
			// create and run threads
			this.sol = new MultiThreadSolution(this.json.getRumorData());
		} catch (Exception e) {

		}

		try {
			String s = setOutputJson(sol);


			// System.out.println(gson.toJson(jsonOutput));
//			return gson.toJson(jsonOutput);
			return s;
		} catch (Exception e) {

		}
		return "Failure";

	}

	private String setOutputJson(MultiThreadSolution sol2) {
		// map output to json object
		ArrayList<HashMap<String, Integer>> jsonOutput = new ArrayList<HashMap<String, Integer>>();

		for (Dijkstra rumor : sol.rumors) {

			HashMap<String, Integer> map = new HashMap<String, Integer>();

			map.put("calcTime", (int) rumor.elapsedTime);
			map.put("rumorID", rumor.rumorID);
			map.put("rumorTravelTime", rumor.shortestPath);

			jsonOutput.add(map);

		}

		Gson gson = new Gson();
		return gson.toJson(jsonOutput);
	}

	public ParseInputJSONString getJson() {
		return json;
	}

	public void setJson(String jsonString) {
		// create Json object
		ParseInputJSONString json = new ParseInputJSONString(jsonString);
		this.json = json;
	}

}
