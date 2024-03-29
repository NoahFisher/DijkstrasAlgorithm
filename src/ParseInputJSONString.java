import com.google.gson.Gson;

public class ParseInputJSONString {
	private RumorDataParser rumorData;

	public ParseInputJSONString(String json) {

		setRumorData(json);

	}

	public RumorDataParser getRumorData() {
		return rumorData;
	}

	public void setRumorData(String json) {
		this.rumorData = new Gson().fromJson(json, RumorDataParser.class);

		// need to add tests to recover if json string not formatted correctly
		// System.out.println(rumorData.rumors instanceof RumorData[]); <-- test
	}

}

class RumorData {

	private int rumorID;
	private String gossiper;
	private String victim;

	public int getRumorID() {
		return rumorID;
	}

	public String getGossiper() {
		return gossiper;
	}

	public String getVictim() {
		return victim;
	}

	public void setTitle(int rumorID) {
		this.rumorID = rumorID;
	}

	public void setGossiper(String gossiper) {
		this.gossiper = gossiper;
	}

	public void setListener(String victim) {
		this.victim = victim;
	}

	public String toString() {
		return String.format("rumorId:%s,\ngossiper:%s,\nvictim:%s", rumorID,
				gossiper, victim);
	}

}

class RumorDataParser {
	RumorData[] rumors;

}
