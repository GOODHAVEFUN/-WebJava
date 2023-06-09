package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest03 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			li.add((10-i) * 10);
		}
		System.out.println(li);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.sort(li, Collections.reverseOrder());
		System.out.println(li);
		li.add(555);
		li.add(365);
		System.out.println(li);
//		Collections.sort(li, Collections.reverseOrder());
//		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);

		Collections.shuffle(li);
		System.out.println(li);

		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
		
		
		
		
		
	}
}
