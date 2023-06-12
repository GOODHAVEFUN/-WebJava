package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex01_2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			numbers.add(r.nextInt(10)+1);
		}
		
		Collections.sort(numbers);
		int count = 0;
		
		while (count < 5) {
			System.out.println("숫자 입력 : ");
			int num =sc.nextInt();
			
			if (numbers.contains(num)) {
				System.out.println("맞았습니다");
				numbers.remove(Integer.valueOf(num));
			}
		}
	}

}