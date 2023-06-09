package set;

import java.util.HashSet;
public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		animalSet.add("");
		animalSet.add("");
		animalSet.add("");
		animalSet.add("");
		animalSet.add("");
		animalSet.add("");
		
		System.out.println(animalSet);
		
		System.out.println("하마");
		System.out.println("하마");
	}
}
