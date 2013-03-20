import org.junit.Test;

public class InputOutputTest {

	@Test
	public void test() {
		 String[] json = { 
		 "{ 'rumors' : [ { 'rumorID' : 1, 'gossiper': Kyler, 'victim': Diana } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 2, 'gossiper': Carmen, 'victim': Angel } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 3, 'gossiper': Sofia, 'victim': Madilyn } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 4, 'gossiper': Brodie, 'victim': Kayla } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 5, 'gossiper': Eliana, 'victim': Marisol } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 6, 'gossiper': Maria, 'victim': Aaliyah } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 7, 'gossiper': Kameron, 'victim': Max } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 8, 'gossiper': Richard, 'victim': Fabian } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 9, 'gossiper': Juan, 'victim': Nicholas } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 10, 'gossiper': Brenda, 'victim': Stephanie } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 11, 'gossiper': Beckett, 'victim': Amelia } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 12, 'gossiper': Penelope, 'victim': Ryder } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 13, 'gossiper': Sarai, 'victim': Baylee } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 14, 'gossiper': Xavier, 'victim': Kyra } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 15, 'gossiper': Katelynn, 'victim': Paola } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 16, 'gossiper': Madyson, 'victim': Kara } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 17, 'gossiper': Jose, 'victim': Brooklyn } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 18, 'gossiper': Sarai, 'victim': Cade } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 19, 'gossiper': Ricky, 'victim': Sophia } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 20, 'gossiper': Bryan, 'victim': Elliot } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 21, 'gossiper': Fabian, 'victim': Douglas } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 22, 'gossiper': Roberto, 'victim': Yasmin } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 23, 'gossiper': Asher, 'victim': Andy } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 24, 'gossiper': Julius, 'victim': Ian } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 25, 'gossiper': Nicholas, 'victim': Mitchell } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 26, 'gossiper': Giovanni, 'victim': Kelvin } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 27, 'gossiper': Theodore, 'victim': Ronald } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 28, 'gossiper': Audrey, 'victim': Lindsay } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 29, 'gossiper': Jorge, 'victim': Shannon } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 30, 'gossiper': Caitlyn, 'victim': Taylor } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 31, 'gossiper': Emely, 'victim': Jacqueline } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 32, 'gossiper': Declan, 'victim': Dennis } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 33, 'gossiper': Penelope, 'victim': Katelyn } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 34, 'gossiper': Kate, 'victim': Alejandro } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 35, 'gossiper': Giselle, 'victim': Walker } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 36, 'gossiper': Erica, 'victim': Jackson } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 37, 'gossiper': Bridget, 'victim': Paola } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 38, 'gossiper': Darius, 'victim': Angelica } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 39, 'gossiper': Andy, 'victim': Jonah } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 40, 'gossiper': Lincoln, 'victim': Mackenzie } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 41, 'gossiper': Colin, 'victim': Claire } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 42, 'gossiper': Baylee, 'victim': Alberto } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 43, 'gossiper': Diana, 'victim': Natasha } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 44, 'gossiper': Kaelyn, 'victim': Alan } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 45, 'gossiper': Abraham, 'victim': Patrick } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 46, 'gossiper': Adam, 'victim': Elise } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 47, 'gossiper': Nina, 'victim': Lacey } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 48, 'gossiper': Natasha, 'victim': Reese } ] }",
		 "{ 'rumors' : [ { 'rumorID' : 49, 'gossiper': Simon, 'victim': Amaya } ] }" } ;

		for (String j : json) {
			InputOutput solution = new InputOutput();

			String s = solution.main(j);

			System.out.println(s);
		}


	}
}
// Input format
// String json =
// { rumors:
// [
// {'rumorID' : int, 'gossiper': string, 'victim': string },
// {'rumorID' : int, 'gossiper': string, 'victim': string }
// ...
// ] } ;""""
