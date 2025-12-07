package exercice_2;

public class TestTripletH {
	public static void main(String[] args) {
		TripletHomogene<Integer, String, Double> th = new TripletHomogene<>(42, "Answer", 3.14);
		th.affiche();

		TripletHomogene<String, Integer, Boolean> th2 = new TripletHomogene<>("Alice", 30, true);
		th2.affiche();
	}
}
