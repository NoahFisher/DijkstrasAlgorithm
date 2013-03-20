import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.stream.MalformedJsonException;

public class InputOutput {

	ParseInputJSONString json;
	private MultiThreadSolution sol;

	public String main(String json) {

		this.json = new ParseInputJSONString(json);

		this.sol = new MultiThreadSolution(this.json.getRumorData());

		String s = setOutputJson(sol);

		return s;

	}

	private String setOutputJson(MultiThreadSolution sol) {
		// map output to json object
		ArrayList<HashMap<String, Integer>> jsonOutput = new ArrayList<HashMap<String, Integer>>();

		for (Dijkstra rumor : sol.rumors) {

			HashMap<String, Integer> map = new HashMap<String, Integer>();

			map.put("calcTime", (int) rumor.elapsedTime);
			map.put("rumorID", rumor.rumorID);
			map.put("rumorTravelTime", rumor.shortestPath);

			jsonOutput.add(map);
		}

		HashMap<String, ArrayList<HashMap<String, Integer>>> jsonOutput2 = 
				new HashMap<String, ArrayList<HashMap<String, Integer>>>();

		 jsonOutput2.put("rumors", jsonOutput);

		Gson gson = new Gson();
		return gson.toJson(jsonOutput2);
	}

	public ParseInputJSONString getJson() {
		return json;
	}

}
