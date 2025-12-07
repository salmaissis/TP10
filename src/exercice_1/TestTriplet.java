package exercice_1;

public class TestTriplet {
	
	public static void main(String[] args) {
		
		Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();
        
        
        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche();
        System.out.println("Second élément de tInt : " + tInt.getSecond());
	}
}
